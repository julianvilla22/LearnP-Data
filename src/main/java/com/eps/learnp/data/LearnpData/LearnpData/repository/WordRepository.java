package com.eps.learnp.data.LearnpData.LearnpData.repository;

import com.eps.learnp.data.LearnpData.LearnpData.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WordRepository extends JpaRepository<Word, Long> {
    @Query(value = """
            SELECT w.*
            FROM word w
                     JOIN example e ON w.idword = e.idword
                     JOIN (
                SELECT idheadword
                FROM example
                WHERE idword = ?1
            ) AS wordrules ON e.idheadword = wordrules.idheadword""", nativeQuery = true)
    List<Word> getWordSiblings(Long id);

    @Query(value = """
            SELECT w.idword, name
            FROM example
                     JOIN rule r ON example.idheadword = r.idheadword
                     JOIN word w ON example.idword = w.idword
            WHERE r.idrule = ?1""", nativeQuery = true)
    List<Word> getRuleExamples(Long id);

    @Query(value = """
            SELECT w.idword, w.name
            FROM exception e
                     JOIN rule r ON e.idheadword = r.idheadword
                     JOIN word w ON e.idword = w.idword
            WHERE idrule = ?1
            """, nativeQuery = true)
    List<Word> getRuleExceptions(Long ruleid);

    @Query(value = """
        SELECT w.idword, w.name
        FROM homophone
                 JOIN word w ON homophone.idword = w.idword OR homophone.idheadword = w.idword
        WHERE (homophone.idheadword = ?1 OR homophone.idword = ?1) AND w.idword <> ?1
        """, nativeQuery = true)
    List<Word> getWordHomophones(Long id);
}
