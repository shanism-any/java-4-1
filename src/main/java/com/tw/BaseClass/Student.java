package com.tw.BaseClass;

import java.util.ArrayList;
import java.util.List;

public class Student{
    private String name;
    private String sno;
    private List<Score> scores;

    public Student(String name, String sno){
        this.name = name;
        this.sno = sno;
        scores = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void addScore(Score score){
        scores.add(score);
    }

    public String getSno() {
        return sno;
    }
}
