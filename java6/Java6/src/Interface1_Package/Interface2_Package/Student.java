package Interface1_Package.Interface2_Package;

import java.util.Date;

import Interface1_Package.Person;

public interface Student extends Person {
    void setFirstDate(int YYYY, int MM, int DD);

    Date getFirstDate();

    void setUniversity(String var1);

    String getUniversity();
}