package Inheritance;

	class Developer extends EmployeeProgram
	  {
		  int Devid=102;
		  String devname="Joseph";
		  
		  public void display1()
		  {
			  System.out.println(Devid+ " "+devname);
		  }
	  
		public static void main(String[] args) 
		{
			Developer d=new Developer();
			d.display();
			d.display1();
			System.out.println(d.empid);
		
		}
	  }