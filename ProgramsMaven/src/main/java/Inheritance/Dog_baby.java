package Inheritance;

public class Dog_baby extends Dog
{
	void display2()
	{
		System.out.println("Baby dog class");
	}
	public static void main(String[] args) 
	{
		Dog_baby db=new Dog_baby();
		db.display2();
		db.display1();
		db.display();
	
	}

}
