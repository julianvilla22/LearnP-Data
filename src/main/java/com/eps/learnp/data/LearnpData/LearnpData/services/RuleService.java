package com.eps.learnp.data.LearnpData.LearnpData.services;

import com.eps.learnp.data.LearnpData.LearnpData.entity.Rule;
import com.eps.learnp.data.LearnpData.LearnpData.entity.Word;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RuleService {
    List<Rule> getAllRules();

    Rule getRuleById(Long id);

    List<Rule> getRulesByIdword(Long id);

}
