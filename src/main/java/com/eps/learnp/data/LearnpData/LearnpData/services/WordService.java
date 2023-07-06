package com.eps.learnp.data.LearnpData.LearnpData.services;

import com.eps.learnp.data.LearnpData.LearnpData.entity.Word;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WordService {
    List<Word> getAllWords();

    Word getWordById(Long id);

    List<Word> getWordSiblings(Long id);

    List<Word> getRuleExamples(Long ruleid);

    List<Word> getRuleExceptions(Long ruleid);

    List<Word> getWordHomophones(Long id);
}
