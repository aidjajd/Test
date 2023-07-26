package com.test.demo3;

import com.test.demo2.Student;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        com.test.demo3.Student s1 = new com.test.demo3.Student
                ("张三",19,"男");
        com.test.demo3.Student s2 = new com.test.demo3.Student
                ("李四",20,"男");
        com.test.demo3.Student s3 = new com.test.demo3.Student
                ("璐璐",19,"女");
        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+stu.getAge()+stu.getId());
        }

    }
}
