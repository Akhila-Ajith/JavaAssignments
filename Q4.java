package Inheritance;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grad g=new Grad();
		Undergrad ug=new Undergrad();
		boolean a=g.isPassed(99);
		boolean b=ug.isPassed(49);
		if(a)
			System.out.println("Grad has passed");
		else
			System.out.println("Grad has not passed");
		if(b)
			System.out.println("Undergrad has passed");
		else
			System.out.println("Undergrad has not passed");
	}

}
