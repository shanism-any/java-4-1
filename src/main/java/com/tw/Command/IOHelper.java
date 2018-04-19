package com.tw.Command;

import com.tw.BaseClass.Score;
import com.tw.BaseClass.Student;
import com.tw.BaseClass.Subject;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IOHelper{
    public static Scanner Scanner = new Scanner(System.in);
    public static DecimalFormat DecimalFormat = new DecimalFormat("###################.###########");

    public static Student getStudentOrDefault(){
        try {
            String str = Scanner.nextLine();
            String[] subStrs = str.split(", ");
            Student student = new Student(subStrs[0], subStrs[1]);
            student.addScore(new Score(Subject.Math, Integer.parseInt(subStrs[2])));
            student.addScore(new Score(Subject.Chinese, Integer.parseInt(subStrs[3])));
            student.addScore(new Score(Subject.English, Integer.parseInt(subStrs[4])));
            student.addScore(new Score(Subject.Program, Integer.parseInt(subStrs[5])));
            return student;
        }
        catch (Exception ex){
            return null;
        }
    }

    public static List<String> getStudentNosOrDefault(){
        try {
            String str = Scanner.nextLine();
            String[] subStrs = str.split(", ");
            List<String> snos = new ArrayList<>();
            snos.addAll(Arrays.asList(subStrs));
            return snos;
        }
        catch (Exception ex){
            return null;
        }
    }
}
