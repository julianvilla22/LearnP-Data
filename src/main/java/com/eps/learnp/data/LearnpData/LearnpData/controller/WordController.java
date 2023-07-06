package com.eps.learnp.data.LearnpData.LearnpData.controller;

import com.eps.learnp.data.LearnpData.LearnpData.entity.Word;
import com.eps.learnp.data.LearnpData.LearnpData.services.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WordController {
    @Autowired
    private WordService wordService;

    @GetMapping("/word")
    public List<Word> getAllWords(){
        return wordService.getAllWords();
    }

    @GetMapping("/word/{id}")
    public Word getWordById(@PathVariable("id") Long id){
        return wordService.getWordById(id);
    }

    @GetMapping("/word/{id}/siblings")
    public List<Word> getWordSiblings(@PathVariable("id") Long id){
        return wordService.getWordSiblings(id);
    }

    @GetMapping("/word/examples/{ruleid}")
    public List<Word> getRuleExamples(@PathVariable("ruleid") Long ruleid){
        return wordService.getRuleExamples(ruleid);
    }

    @GetMapping("/word/exceptions/{ruleid}")
    public List<Word> getRuleExceptions(@PathVariable("ruleid") Long ruleid){
        return wordService.getRuleExceptions(ruleid);
    }

    @GetMapping("/word/{id}/homophones")
    public List<Word> getWordHomophones(@PathVariable("id") Long id){
        return wordService.getWordHomophones(id);
    }


}
