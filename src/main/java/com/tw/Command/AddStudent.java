package com.tw.Command;

import com.tw.BaseClass.Student;

import java.util.List;

public class AddStudent implements ICommand{

    private List<Student> students;

    public AddStudent(List<Student> students){
        this.students = students;
    }

    @Override
    public void Execute() {
        printInputPrompt();
        while (true){
            Student student = IOHelper.getStudentOrDefault();
            if(student != null){
                students.add(student);
                printSuccessedInputPrompt(student);
                break;
            }
            else{
                printValidInputPrompt();
            }
        }
    }

    private void printInputPrompt(){
        System.out.println("请输入学生信息（格式：姓名, 学号, 学科: 成绩, ...）");
    }

    private void printValidInputPrompt(){
        System.out.println("请按正确的格式输入（格式：姓名, 学号, 学科: 成绩, ...）");
    }

    private void printSuccessedInputPrompt(Student student){
        System.out.println(String.format("学生%s的成绩被添加", student.getName()));
    }
}
