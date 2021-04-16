package samples;

public class StaticFields {
	
	public static int x = 7;
    public int y = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticFields a = new StaticFields(); 
		StaticFields b = new StaticFields(); 
		a.y = 5; 
		b.y = 6; 
		a.x = 1; 
		b.x = 2; //x is set to 2. Regardless of which instance set its value, the value of x is now set to 2 and remains 2 unless
					//set again
		System.out.println("a.y = " + a.y); //returns 5
		System.out.println("b.y = " + b.y); //returns 6
		System.out.println("a.x = " + a.x); //returns 2, not 1 (last value set to x was 2)
		System.out.println("b.x = " + b.x); //returns 2
		System.out.println("StaticFields.x = " + StaticFields.x); //returns 2
	}

}
