package com.tw.Menu;

import java.util.ArrayList;
import java.util.List;

public class MenuManager{
    private List<Menu> menus;

    public MenuManager(){
        menus = new ArrayList<>();
    }

    public void addMenu(Menu menu){
        menus.add(menu);
    }

    public void PrintMenuOptions(){
        for (int i = 0; i < menus.size(); i++) {
            System.out.println( String.format("%d. %s",i+1, menus.get(i).getName()));
        }
        if(menus.size() > 0){
            System.out.println(String.format("请输入你的选择（1～%d）：", menus.size()));
        }
    }

    public void ExecuteCommand(int index) throws Exception {
        menus.get(index - 1).getCommand().Execute();
    }
}
