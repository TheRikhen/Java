package com.company;

public class Main {

    public static void main(String[] args) throws Exception1,Exception2 {
        try
        {
            AAA keka = new AAA(1,2);
            keka.getResult(-4);

        }

        catch (Exception1 e)
        {
            System.out.println("Value is zero");
        }
        catch (Exception2 e)
        {
            System.out.println("Value less than zero");
        }
    }
}
