package com.tw.BaseClass;

public  class SubjectHelper{
    public static String getSubjectName(Subject subject) throws Exception {
        switch (subject){
            case Math:
                return "数学";
            case Chinese:
                return "语文";
            case English:
                return "英语";
            case Program:
                return "编程";
                default:
                    throw new Exception("不支持该枚举项");
        }
    }
}
