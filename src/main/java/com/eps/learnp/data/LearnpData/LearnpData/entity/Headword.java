package com.eps.learnp.data.LearnpData.LearnpData.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Headword {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idheadword;

    private Long idword;

    public Long getIdword() {
        return idword;
    }

    public void setIdword(Long idword) {
        this.idword = idword;
    }

    public void setIdheadword(Long idheadword) {
        this.idheadword = idheadword;
    }

    public Long getIdheadword() {
        return idheadword;
    }
}
