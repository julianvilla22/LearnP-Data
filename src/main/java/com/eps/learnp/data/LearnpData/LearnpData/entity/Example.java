package com.eps.learnp.data.LearnpData.LearnpData.entity;

import jakarta.persistence.*;

@Entity
public class Example {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idexample;
    private Long idword;
    private Long idheadword;

    public Long getIdword() {
        return idword;
    }

    public void setIdword(Long idword) {
        this.idword = idword;
    }

    public Long getIdheadword() {
        return idheadword;
    }

    public void setIdheadword(Long idheadword) {
        this.idheadword = idheadword;
    }

    public void setIdexample(Long idexample) {
        this.idexample = idexample;
    }

    public Long getIdexample() {
        return idexample;
    }
}
