package Interface;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Rectangle rect[]= new Rectangle[5];
		Square sqr[]= new Square[5];
		char ch='n';
		int i=0,j=0;
		do {
		System.out.println("Enter the dimensions of rectangle:");
		rect[i++]= new Rectangle(scan.nextInt(),scan.nextInt());
		if(i==5)
		{
			break;
		}
		System.out.println("Do you want to continue?(Y/N)");
		ch = scan.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		do {
			System.out.println("Enter the dimensions of Square:");
			sqr[j++]= new Square(scan.nextInt());
			if(j==5)
			{
				break;
			}
			System.out.println("Do you want to continue?(Y/N)");
			ch = scan.next().charAt(0);
			}while(ch=='y' || ch=='Y');
		for(Rectangle r:rect)
		{
			try {
			calculateArea(r);
			}
			catch(NullPointerException e)
			{
				
			}
		}
		for(Square sq:sqr)
		{
			try {
			calculateArea(sq);
			}
			catch(NullPointerException e)
			{
				
			}
		}
	}

	private static void calculateArea(Shape s) {
		// TODO Auto-generated method stub
		s.area();
	}

	}


