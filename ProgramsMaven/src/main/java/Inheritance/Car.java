package Inheritance;

public class Car extends Vehicle
{
	void display2()
	 {
		 System.out.println("car method");
	 }
	
	public static void main(String[] args) 
	{
		Car c=new Car();
		c.display();
		c.display2();
	    Bike b=new Bike();
	    b.display1();
	    b.display();
	}

}
