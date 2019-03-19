package Interface1_Package;

import java.util.Date;

public interface Person {
    int LimitYYYY = 1900;

    void setSurname(String surname);

    void setName(String name);

    void setFatherName(String fatherName);

    void setBirthday(int YYYY, int MM, int DD);

    String getSurname();

    String getName();

    String getFatherName();

    Date getBirthday();
}
