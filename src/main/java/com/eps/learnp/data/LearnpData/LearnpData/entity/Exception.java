package com.eps.learnp.data.LearnpData.LearnpData.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Exception {
    public Long getIdword() {
        return idword;
    }

    public void setIdword(Long idword) {
        this.idword = idword;
    }

    @Id
    @GeneratedValue
    private Long idheadword;
    private Long idword;

    public void setIdheadword(Long idheadword) {
        this.idheadword = idheadword;
    }

    public Long getIdheadword() {
        return idheadword;
    }
}
