package com.company;

import Package_1.*;
import Package_1.Package_2.Package_3.Package_4.*;
import Package_1.Package_2.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AAA aaa = new AAA(11);
        aaa.Infout();
        //Package_1.Package_2.BBB bbb = new Package_1.Package_2.BBB(22);
        //bbb.Infout();
        //Package_1.Package_2.DDD ddd = new Package_1.Package_2.DDD(23);
        //ddd.Infout();
        BBB bbb = new BBB(22);
        bbb.Infout();
        DDD ddd = new DDD(23);
        ddd.Infout();
        //Package_1.Package_2.Package_3.Package_4.CCC ccc = new Package_1.Package_2.Package_3.Package_4.CCC(33);
        //ccc.Infout();
        //Package_1.Package_2.Package_3.Package_4.FFF fff = new Package_1.Package_2.Package_3.Package_4.FFF(34);
        //ccc.Infout();
        CCC ccc = new CCC(33);
        ccc.Infout();
        FFF fff = new FFF(34);
        ccc.Infout();
    }
}
