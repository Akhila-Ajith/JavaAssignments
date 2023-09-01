package Inheritance;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxWeight a=new BoxWeight(10,20,30,40);
		System.out.println(" Box1 "+a);
		System.out.println("Volume of Box1 = "+a.volume());
		BoxWeight b=new BoxWeight(20,30,40,50);
		System.out.println(" Box2 "+b);
		System.out.println("Volume of Box2 = "+b.volume());
	}

}
