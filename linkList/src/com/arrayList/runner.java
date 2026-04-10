package com.arrayList;

import java.util.ArrayList;

public class runner {
    public static void main(String[] args){
        ArrayList<student> Stu = new ArrayList<>();
        Stu.add(new student(29,"karan",80.66,"101"));
        Stu.add(new student(12,"mohit",30.66,"102"));
        Stu.add(new student(23,"shivam",45.66,"103"));
        Stu.add(new student(45,"kapil",89.66,"105"));
        Stu.add(new student(12,"kalu",90.66,"104"));

        for(student data:Stu){
            System.out.println(data);
        }

    }
}
