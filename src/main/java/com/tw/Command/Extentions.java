package com.tw.Command;

import com.tw.BaseClass.Student;

import java.util.List;
import java.util.stream.Collectors;

public class Extentions{
    public static double TotalScore(Student student){
        return student.getScores().stream().mapToDouble(m -> m.getScore()).sum();
    }

    public  static double TotalScore(List<Student> students){
        return students.stream().mapToDouble(m -> TotalScore(m)).sum();
    }

    public static  double AverageScore(Student student){
        return TotalScore(student) / student.getScores().size();
    }

    public static  double AverageScore(List<Student> students){
        return TotalScore(students) / students.size();
    }

    public static  double MiddleScore(List<Student> students){

        List<Double> list = students.stream().mapToDouble(m -> TotalScore(m)).sorted().boxed().collect(Collectors.toList());
        int size = list.size();
        if(size == 0) return 0;
        if(size % 2 == 1){
            return list.get(size / 2);
        }
        else{
            return (list.get(size/ 2 -1) + list.get(size/ 2))/2;
        }

    }
}
