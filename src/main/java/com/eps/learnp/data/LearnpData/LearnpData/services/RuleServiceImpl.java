package com.eps.learnp.data.LearnpData.LearnpData.services;

import com.eps.learnp.data.LearnpData.LearnpData.entity.Rule;
import com.eps.learnp.data.LearnpData.LearnpData.repository.RuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RuleServiceImpl implements RuleService{

    @Autowired
    private RuleRepository ruleRepository;
    @Override
    public List<Rule> getAllRules() {
        return ruleRepository.findAll();
    }

    @Override
    public Rule getRuleById(Long id) {
        Optional<Rule> rule = ruleRepository.findById(id);
        return rule.orElse(null);
    }

    @Override
    public List<Rule> getRulesByIdword(Long idWord){
        return ruleRepository.getRulesByIdword(idWord);
    }
}
