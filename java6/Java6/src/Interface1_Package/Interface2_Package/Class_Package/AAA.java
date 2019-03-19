package Interface1_Package.Interface2_Package.Class_Package;

import java.util.Date;

import Interface1_Package.Person;

public class AAA implements Person {
    private String Surname;
    private String Name;
    private String FatherName;
    private Date Birthday;
    private Date FirstDate;
    private String University;
    int LimitUniversityLength = 10;

    public AAA() {
    }

    public void setSurname(String surname) {
        this.Surname = surname;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setFatherName(String fatherName) {
        this.FatherName = fatherName;
    }

    public void setBirthday(int YYYY, int MM, int DD) {
        if (1900 < YYYY) {
            this.Birthday = new Date(YYYY, MM, DD);
        }

    }

    public void setUniversity(String university) {
        if (this.LimitUniversityLength > university.length()) 
        {
        	University = university;
        }
    }

    public void setFirstDate(int YYYY, int MM, int DD) {
        this.FirstDate = new Date(YYYY, MM, DD);
    }

    public String getSurname() {
        return this.Surname;
    }

    public String getName() {
        return this.Name;
    }

    public String getFatherName() {
        return this.FatherName;
    }

    public Date getBirthday() {
        return this.Birthday;
    }

    public Date getFirstDate() {
        return this.FirstDate;
    }
}


