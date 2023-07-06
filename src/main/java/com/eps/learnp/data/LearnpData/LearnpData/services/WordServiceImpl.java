package com.eps.learnp.data.LearnpData.LearnpData.services;

import com.eps.learnp.data.LearnpData.LearnpData.entity.Word;
import com.eps.learnp.data.LearnpData.LearnpData.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WordServiceImpl implements WordService{

    @Autowired
    private WordRepository wordRepository;
    @Override
    public List<Word> getAllWords() {
        return wordRepository.findAll();
    }

    @Override
    public Word getWordById(Long id) {
        Optional<Word> word = wordRepository.findById(id);
        return word.orElse(null);
    }

    @Override
    public List<Word> getWordSiblings(Long id) {
        return wordRepository.getWordSiblings(id);
    }

    @Override
    public List<Word> getRuleExamples(Long ruleid) {
        return wordRepository.getRuleExamples(ruleid);
    }

    @Override
    public List<Word> getRuleExceptions(Long ruleid) {
        return wordRepository.getRuleExceptions(ruleid);
    }

    @Override
    public List<Word> getWordHomophones(Long id) {
        return wordRepository.getWordHomophones(id);
    }


}
