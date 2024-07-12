package Inheritance;

public class TotalSal extends HRA
{
	float t;
	void total()
	{
		t=basic+deduction+bonus;
		System.out.println("Total salary of an employee is:"+ t);
		}

	public static void main(String[] args) 
	{
		TotalSal ts=new TotalSal();
		//ts.total();
		ts.display();
		ts.hradisplay();

	}

}
