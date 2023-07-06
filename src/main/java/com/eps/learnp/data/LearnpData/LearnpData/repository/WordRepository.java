package com.eps.learnp.data.LearnpData.LearnpData.repository;

import com.eps.learnp.data.LearnpData.LearnpData.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WordRepository extends JpaRepository<Word, Long> {
    @Query(value = "SELECT w.*\n" +
                   "FROM word w\n" +
                   "         JOIN example e ON w.idword = e.idword\n" +
                   "         JOIN (\n" +
                   "    SELECT idheadword\n" +
                   "    FROM example\n" +
                   "    WHERE idword = ?1\n" +
                   ") AS wordrules ON e.idheadword = wordrules.idheadword", nativeQuery = true)
    List<Word> getWordSiblings(Long id);

    @Query(value = "SELECT w.idword, name\n" +
                   "FROM example\n" +
                   "         JOIN rule r ON example.idheadword = r.idheadword\n" +
                   "         JOIN word w ON example.idword = w.idword\n" +
                   "WHERE r.idrule = ?1", nativeQuery = true)
    List<Word> getRuleExamples(Long id);

    @Query(value = "SELECT w.idword, w.name\n" +
                   "FROM exception e\n" +
                   "         JOIN rule r ON e.idheadword = r.idheadword\n" +
                   "         JOIN word w ON e.idword = w.idword\n" +
                   "WHERE idrule = ?1\n", nativeQuery = true)
    List<Word> getRuleExceptions(Long ruleid);

    @Query(value = "SELECT w.idword, w.name\n" +
                   "FROM homophone\n" +
                   "         JOIN word w ON homophone.idword = w.idword OR homophone.idheadword = w.idword\n" +
                   "WHERE (homophone.idheadword = ?1 OR homophone.idword = ?1) AND w.idword <> ?1\n", nativeQuery = true)
    List<Word> getWordHomophones(Long id);
}
