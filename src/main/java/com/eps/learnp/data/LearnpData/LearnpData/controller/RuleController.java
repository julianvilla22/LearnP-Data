package com.eps.learnp.data.LearnpData.LearnpData.controller;

import com.eps.learnp.data.LearnpData.LearnpData.entity.Rule;
import com.eps.learnp.data.LearnpData.LearnpData.entity.Word;
import com.eps.learnp.data.LearnpData.LearnpData.services.RuleService;
import com.eps.learnp.data.LearnpData.LearnpData.services.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RuleController {
    @Autowired
    private RuleService ruleService;

    @GetMapping("/rule")
    public List<Rule> getAllRules(){
        return ruleService.getAllRules();
    }

    @GetMapping("/word/{id}/rule")
    public List<Rule> getRuleByIdword(@PathVariable("id") Long id){
        return ruleService.getRulesByIdword(id);
    }
}
