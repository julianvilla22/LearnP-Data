package com.eps.learnp.data.LearnpData.LearnpData.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Rule {
    @Id
    private Long idrule;

    private Long idheadword;

    private String text;



    public void setIdrule(Long idrule) {
        this.idrule = idrule;
    }

    public Long getIdrule() {
        return idrule;
    }

    public Long getIdheadword() {
        return idheadword;
    }

    public void setIdheadword(Long idheadword) {
        this.idheadword = idheadword;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
