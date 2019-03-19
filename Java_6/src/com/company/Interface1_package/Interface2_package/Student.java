package com.company.Interface1_package.Interface2_package;

import com.company.Interface1_package.Person;

import java.util.Date;

public interface Student extends Person {
    void setFirstDate(int YYYY, int MM, int DD);

    Date getFirstDate();

    void setUniversity(String var1);

    String getUniversity();
}