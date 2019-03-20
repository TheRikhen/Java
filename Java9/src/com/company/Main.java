package com.company;

public class Main {

    public enum planet
    {
        Marth,
        Earth,
        Jupiter
    }

    public enum Person
    {
        Petya(100,185),
        Sasha(89,170),
        Ilya(60,170);
        private final int height;
        private final int growth;
        Person(int Height,int Growth)
        {
            this.height = Height;
            this.growth = Growth;
        }
    }



    public static void main(String[] args) {
        String s01 = new String();
        System.out.println("s01.length = " + s01.length());

        char[] cs = {'k','s','e','i','o'};
        String s02 = new String(cs);
        System.out.println("s02.length = " + s02.length()+ "\r\ns02: " + s02);

        String s03 = new String(cs, 0,2);
        System.out.println("s03.length = " + s03.length()+ "\r\ns03: " + s03);

        String s04 = "012432424";
        System.out.println("s04.length = " + s04.length()+ "\r\ns04: " + s04);

        String s05 = ("012432424");
        System.out.println("s05.length = " + s05.length()+ "\r\ns05: " + s05);

        System.out.println("\"fsdfsdfqwr\".length = " + "fsdfsdfqwr".length());

        String s06 = new String("12312412");
        for (int i=0; i<s06.length();i++)
        {
            System.out.print(s06.charAt(i) + ((i < s06.length() - 1) ? "-" : ""));
        }
        System.out.println("");
        char[] cs1 = new char[6-2];
        s06.getChars(2,6,cs1,0);
        for (int i=0;i<cs1.length;i++)
        {
            System.out.print(cs1[i]+ ((i<cs1.length - 1)? "-" : ""));
        }
        System.out.println("");

        String s07 = new String("897578");
        String s08 = new String("897578");
        System.out.println("(s07==s08) = " + s07==s08);
        System.out.println("(s07==\"897578\") = " + s07=="897578");
        System.out.println("s07.equals(s08) = " + s07.equals(s08));
        String s09 = s08;
        System.out.println("(s08==s09) = " + s08==s09);

        String s10 = new String("Шел петя по шоссе и употреблял хлебобулочные изделия");
        System.out.println(s10.indexOf("о"));
        System.out.println(s10.indexOf("i"));
        System.out.println(s10.lastIndexOf("о"));
        System.out.println(s10.lastIndexOf("о",5));

        String s11 = new String("Ехал Грека через реку, Видит Грека в реке рак, Сунул в реку руку Грека, Рак за руку Греку - цап.");
        System.out.println(s11.substring(25));
        System.out.println(s11.substring(11,25));

        String s12 = new String("Оффтоп - это плохо, писать нужно по делу");
        System.out.println(s12.toUpperCase());
        System.out.println(s12.replace('ф','f'));
        System.out.println(s12.toLowerCase());

        StringBuffer s15 = new StringBuffer(100);
        s15.append("Корабли  лавировали, лавировали да не вылавировали");
        System.out.println("s15 length: " + s15.length());
        System.out.println("s15 Capacity: " + s15.capacity());
        s15.insert(8,"Hello");
        System.out.println(s15);
        System.out.println("s15 length: " + s15.length());
        System.out.println("s15 Capacity: " + s15.capacity());
        s15.delete(11,17);
        System.out.println(s15);
        s15.ensureCapacity(200);
        System.out.println("s15 Capacity: " + s15.capacity());
        String s16 = s15.toString();

        planet Planet = planet.Earth;

        Person person = Person.Petya;
        System.out.println(person.growth);
        System.out.println(person.height);
    }
}
