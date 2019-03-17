package Package_1;

public class EEE {
	
	static int randvar;
	
    public EEE(int x)
    {
        randvar = x;
    }
    
    
    public void Infout() {
        System.out.println("Second folder, Package1, EEE: " + randvar);
    }
    	public static int sum() {
            return randvar + randvar;
        }
}
