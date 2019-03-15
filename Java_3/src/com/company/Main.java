package com.company;
class program
{
    static int height;
    static void setHeight(int value)
    {
        height = value;
    }
}
public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] xx = new int[10];
        for (int i = 0; i < xx.length; i++) {
            xx[i] = i;
        }
        for (int i = 0; i < xx.length; i++) {
            System.out.println(xx[i]);
        }
        int[][] Multimassive = new int[5][5];
        for (int i = 0; i < Multimassive.length; i++) {
            for (int j = 0; j < Multimassive[i].length; j++) {
                Multimassive[i][j] = i + j;
            }
        }

        for (int i = 0; i < Multimassive.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < Multimassive[i].length; j++) {
                System.out.print(Multimassive[i][j] + " ");
            }

        }

        int number = 200;
        number >>>= 4;
        System.out.println("\n" + "Var number after >>>: " + number);
        System.out.println("Var number in binary view: " + Integer.toBinaryString(200));
        System.out.println("Var number after >>> in binary view:  " + Integer.toBinaryString(number));
        number <<= 8;
        System.out.println("Var number after <<=: " + number);
        System.out.println("Var number after <<= in binary view: " + Integer.toBinaryString(number));
        int var2 = number ^= 87;
        System.out.println(var2);

        int a1 = 2;
        int b1 = 5;
        System.out.println("Binary view of the var1: " + Integer.toBinaryString(a1));
        System.out.println("Binary view of the var2: " + Integer.toBinaryString(b1));
        System.out.println("Result of logical multiplication: " + (int) (a1 & b1));
        int c1 = ~12;
        System.out.println("Result of NOT: " + c1);

        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));

        int Age = 22;

        if (Age > 18) {
            System.out.println("Big Child");
        } else System.out.println("Child");

        String answer = (Age > 18) ? "Adult" : "Child";
        System.out.println(answer);
        System.out.println("Using while");
        int i1 = 5;
        while (i1 < 8) {
            i1++;
            System.out.println(i1);
        }

        int d1 = 4;
        System.out.println("Using do-while");
        do {
            d1++;
            System.out.println(d1);
        }
        while (d1 < 3);

        int num = 6;
        switch (num) {

            case 1:
                System.out.println("число равно 1");
                break;
            case 6:
                System.out.println("число равно 6");
                break;
        }


        program.height=175;
        program program1 = new program();
        program1.height=180;
        program program2 = new program();
        program2.height=185;
        program1.setHeight(7);
        System.out.println(program.height);
        System.out.println(program1.height);
        System.out.println(program2.height);
    }
}




