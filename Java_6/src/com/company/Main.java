package com.company;

import com.company.Interface1_package.Interface2_package.Class_package.AAA;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        AAA student1 = new AAA();
        student1.setSurname("Prikhach");
        student1.setName("Eugene");
        student1.setFatherName("Aliaksandr");
        student1.setUniversity("Belstu");
        student1.setBirthday(1998, 12, 1);
        student1.setFirstDate(2016, 9, 18);
        System.out.println(student1.getName());
        System.out.println(student1.getFatherName());
        System.out.println(student1.getFirstDate());
    }
}