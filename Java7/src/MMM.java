import Package1.first;
import Package1.Package2.second;
import Package1.Package2.Package3.Third;
import Package1.Package2.Package3.Package4.Fourth;

public class MMM 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("AAA");
		AAA cl1 = new AAA();
		
		System.out.println("First");
		first cl2 = new first();

		System.out.println("Second");
		second cl3 = new second();
		
		System.out.println("Third");
		Third cl4 = new Third();
		
		System.out.println("Fourth");
		Fourth cl5 = new Fourth();
	}

}
