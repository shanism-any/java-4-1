package com.tw.BaseClass;

public class Score{
    private Subject subject;
    private double score;

    public Score(Subject subject, double score){
        this.subject = subject;
        this.score = score;
    }

    public Subject getSubject() {
        return subject;
    }

    public Double getScore() {
        return score;
    }
}

