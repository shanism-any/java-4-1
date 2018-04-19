package com.tw;

import com.tw.BaseClass.Student;
import com.tw.Command.*;
import com.tw.Menu.Menu;
import com.tw.Menu.MenuManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        List<Student> students = new ArrayList<>();
        MenuManager menuManager = new MenuManager();
        menuManager.addMenu(new Menu("添加学生", new AddStudent(students)));
        menuManager.addMenu(new Menu("生成成绩单", new CreateGradeReport(students)));
        menuManager.addMenu(new Menu("退出", new Exit()));
        while (true){
            menuManager.PrintMenuOptions();
            menuManager.ExecuteCommand(Integer.parseInt(IOHelper.Scanner.nextLine()));
        }
    }

}


