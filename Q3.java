package Strings;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int flag=0;
		Scanner scan=new Scanner(System.in);
		String result = "NULL";
		System.out.print("Enter String : ");
		String str=scan.nextLine();
		int length = str.length();
		for (int i = length / 2; i > 0; i--) {
            String prefix = str.substring(0, i);
            String suffix = str.substring(length - i);
                       
            if (prefix.equals(suffix)) {
                result = prefix;
                flag++;
                break;
            }
        }
		if(flag==0)
            	System.out.println("No common end substring found.");
		else
			System.out.println("Longest common end substring: "+result);
		scan.close();
	}}
