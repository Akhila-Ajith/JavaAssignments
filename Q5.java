package Strings;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String str=""; 
		Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        int index=input.indexOf('#');
	        
	        for (int i = 0; i < input.length(); i++) {
	            if (input.charAt(i) == '#') {
	                if (i > 0 && i < input.length() - 1) {
	                    // Skip current character and its neighbor
	                    i += 1;
	                }
	            }
	            else {
	            	str=str+input.charAt(i);
	            	//str.append(str.charAt(i));
	            }

	}
*/
		Scanner scan=new Scanner(System.in);
		String result="";
		System.out.print("Enter String : ");
		String input=scan.nextLine();
		int index = input.indexOf('#');
		char[] string = input.toCharArray();
		for(int i=index-1;i<string.length-3;i++)
			string[i]=string[i+3];
		for(int i=0;i<string.length-3;i++)
			result+=string[i];

		System.out.println("The string after removing # and neighbours is "+result);
		scan.close();
	}
}
