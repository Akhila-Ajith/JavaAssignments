package Inheritance;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
		        int intNum1 = 5;
		        int intNum2 = 10;
		        float result1 = add(intNum1, intNum2);
		        System.out.println("Addition of integers: " + result1);
		        
		        
		        float floatNum1 = 3.5f;
		        float floatNum2 = 2.5f;
		        int result2 = add(floatNum1, floatNum2);
		        System.out.println("Addition of floats: " + result2);
	
	}
	 static float add(int num1, int num2) {
	        return (float)(num1 + num2);
	    }
	    
	  
	 static int add(float num1, float num2) {
	        return (int)(num1 + num2);
	    }
}

