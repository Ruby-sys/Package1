package Inheritance;

import java.util.Scanner;

public class Salary 
{
String empname;
int basic;
float bonus, deduction;

Scanner s=new Scanner(System.in);

void display()
{
	System.out.println("Enter name");
	empname=s.next();
	
	System.out.println("Employee basic pay");
	basic=s.nextInt();

	
	System.out.println("Employee Deduction");
	deduction=s.nextFloat();
	
	System.out.println("Employee Bonus");
	bonus=s.nextFloat();
}
}

	
