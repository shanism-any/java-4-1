package com.tw.Command;

import com.tw.BaseClass.Score;
import com.tw.BaseClass.Student;
import com.tw.BaseClass.Subject;
import com.tw.BaseClass.SubjectHelper;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CreateGradeReport  implements ICommand{

    private List<Student> students;

    public CreateGradeReport(List<Student> students){
        this.students = students;
    }


    @Override
    public void Execute() throws Exception {
        printInputPrompt();
        while (true){
             List<String> snos = IOHelper.getStudentNosOrDefault();
            if(snos != null){
                printSuccessedInputPrompt(snos);
                break;
            }
            else{
                printValidInputPrompt();
            }
        }
    }

    private void printInputPrompt(){
        System.out.println("请输入要打印的学生的学号（格式： 学号, 学号,...）");
    }

    private void printValidInputPrompt(){
        System.out.println("请按正确的格式输入要打印的学生的学号（格式： 学号, 学号,...）");
    }

    private void printSuccessedInputPrompt(List<String> snos) throws Exception {
        System.out.println("成绩单");
        System.out.print("姓名");
        System.out.println(String.format("姓名|%s|%s|%s|%s|平均分|总分"
                ,SubjectHelper.getSubjectName(Subject.Math)
                ,SubjectHelper.getSubjectName(Subject.Chinese)
                ,SubjectHelper.getSubjectName(Subject.English)
                ,SubjectHelper.getSubjectName(Subject.Program) ));
        System.out.println("========================");
        students.stream().filter(m -> snos.contains(m.getSno())).forEach(m -> printStudentScore(m));
        System.out.println("========================");
        System.out.println(String.format("全班总分平均数：%s", IOHelper.DecimalFormat.format(Extentions.TotalScore(students))));
        System.out.println(String.format("全班总分中位数：%s", IOHelper.DecimalFormat.format(Extentions.MiddleScore(students))));
    }

    private void printStudentScore(Student student){
        System.out.print(student.getName());
        student.getScores().forEach(m -> System.out.print(String.format("|%s" ,IOHelper.DecimalFormat.format(m.getScore()))));
        System.out.println(String.format("|%s|%s", IOHelper.DecimalFormat.format(Extentions.AverageScore(student)), IOHelper.DecimalFormat.format(Extentions.TotalScore(student))));
    }
}

