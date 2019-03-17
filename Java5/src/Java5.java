
/**
 * 
 */
/**
 * @author rikhen
 *
 */
import Package_1.*;
import Package_1.Package_2.Package_3.Package_4.*;
import Package_1.Package_2.*;

	public class Java5
	{
static int x;
	    public static void main(String[] args) {
		// write your code here
	        AAA aaaa = new AAA(11);
	        aaaa.Infout();
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
	        III iiii = new III(33);
	        iiii.Infout();
	        FFF fff = new FFF(34);
	        fff.Infout();
	        EEE eee = new EEE(44);
	        eee.Infout();
	        GGG ggg = new GGG(55);
	        ggg.Infout();
	        HHH hhh = new HHH(56);
	        hhh.Infout();
	        CCC ccc = new CCC(66);
	        ccc.Infout();
	        LLL lll = new LLL(67);
	        lll.Infout();
	        AAA aaa = new AAA(6);
	        aaa.kon();
	        UUU uuu = new UUU(6);
	        x=uuu.calc(5);
	        System.out.println(x);
	    }
	}