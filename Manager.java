package assignment;

class Employee {
	private int empNumber;
	private String empName;
	public Employee()
	{
		empNumber=0;
		empName="";
	}
	public Employee(int a,String s)
	{
		empNumber=a;
		empName=s;
	}
	void display()
	{
		System.out.println(empNumber+" "+empName);
		
	}
	
}

public class Manager extends Employee{
	
	public Manager(int a,String b){
		super(a,b);
	}
	void display() {
		System.out.println("details");
		super.display();
	}
	public static void main(String args[])
	{
		Manager A=new Manager(40,"Sakshi");
		A.display();
		
	}
}
