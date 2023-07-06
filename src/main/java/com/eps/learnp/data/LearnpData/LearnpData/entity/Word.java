package com.eps.learnp.data.LearnpData.LearnpData.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Word {
    @Id
    private Long idword;

    private String name;

    public Word(Long idword, String name){
        this.idword = idword;
        this.name = name;
    }

    public Word() {

    }

    public Long getIdword() {
        return idword;
    }

    public void setIdword(Long idword) {
        this.idword = idword;
    }

    public String getName() {
        return name;
    }

    public void setName(String word) {
        this.name = word;
    }

}
