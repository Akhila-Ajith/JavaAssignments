package Interface;

import com.faith.propel.java.camp4.Cat;
import com.faith.propel.java.camp4.Dog;
import com.faith.propel.java.camp4.MyAnimals;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAnimals a = new MyAnimals();
		a.setBodyTemp("25");
		System.out.println("Body temperature =  "+a.getBodyTemp());
		System.out.println("getBodyTemperature :  "+a.GetBodyTemp(a.getBodyTemp()));
		Cat c = new Cat();
		c.saySomething();
		Dog d = new Dog();
		d.saySomething();
	}

}
