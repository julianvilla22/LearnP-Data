package com.eps.learnp.data.LearnpData.LearnpData.repository;

import com.eps.learnp.data.LearnpData.LearnpData.entity.Rule;
import com.eps.learnp.data.LearnpData.LearnpData.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RuleRepository extends JpaRepository<Rule, Long> {
    @Query(
            value = "select r.idrule, r.text, r.idheadword from example e join rule r on e.idheadword = r.idheadword join word w on w.idword = e.idword  where w.idword = ?1",
            nativeQuery = true)
    List<Rule> getRulesByIdword(Long idWord);


}
