package com.eps.learnp.data.LearnpData.LearnpData.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Homophone {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idhomophone;
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



    public void setIdhomophone(Long idhomopgone) {
        this.idhomophone = idhomopgone;
    }

    public Long getIdhomophone() {
        return idhomophone;
    }
}
