package samples;

/*
 * Given the following class, called NumberHolder, write some code that :
 * creates an instance of the class, :
 * initializes its two member variables, 
 * and then displays the value of each member variable.
 */


public class NumberHolder {
	

	public int anInt;
    public float aFloat;
    
    //2.Create a constructor to initialize instance variables (fields)
     NumberHolder(){
    	anInt = 1;
    	aFloat	= 2.5f; 
     }
     
     //4.Create a method to display (get/return) state (values) the instance variables
     int getInteger(){
    	 return anInt;
     }
     
   //6.Create a method to display (get/return) state (values) the instance variables
     
    float getFloat(){
    	return aFloat;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 /* create an instance of the class, :
			 * initializes its two member variables, 
			 * and then displays the value of each member variable.
			 * 
			*/
		
	NumberHolder aNumberHolder;
	aNumberHolder = new NumberHolder(); //1.Call a constructor to initialize instance variables (fields)
	
	//3.Call an instance method to display the initialized value of int type instance variable 
	System.out.println(aNumberHolder.getInteger());
		
	//5.Call an instance method to display the initialized value of float type instance variable
	System.out.println(aNumberHolder.getFloat());
	
	/*or simply do this (using default constructor and directly accessing instance variables
	 * NumberHolder aNumberHolder = new NumberHolder();
		aNumberHolder.anInt = 1;
		aNumberHolder.aFloat = 2.3f;
		System.out.println(aNumberHolder.anInt);
		System.out.println(aNumberHolder.aFloat);
	*/
		
	}

}
