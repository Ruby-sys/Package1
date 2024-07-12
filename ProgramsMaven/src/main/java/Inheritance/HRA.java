package Inheritance;

public class HRA extends Salary
{
	float hrvalue,pfvalue;
	
   void hradisplay()
 {
	hrvalue= (5/100)*basic;
	System.out.println("HRA of an employee" +empname+ " "+hrvalue);
 }
   void pfdisplay()
   {
	   pfvalue=(20/100)*basic;
	   System.out.println("PF of an employee"+empname+ " "+pfvalue);
   }

}
