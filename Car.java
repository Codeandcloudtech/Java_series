package assignment;

public class Car
{
 String color,company;
  public Car(String c,String a)
  {
	  color=c;
	  company=a;
  }
  void display()
  {
	  System.out.println(this.color);
	  System.out.println(this.company);
  }
 
	public static void main(String [] args)
	{
		System.out.println("Hello World");
		Car A= new Car("Green","Maruti");
		A.display();
	}
}


2)
package assignment;

public class Mobile {
int serialNumber,price;
String type,manufacturer,model;
	public Mobile()
	{
		serialNumber=0;
		price=0;
		type=" ";
		manufacturer=" ";
		model=" ";
		
	}
	public Mobile(int p,String t,String man,String m)
	{
		
		price=p;
		type=" ";
		manufacturer=man;
		model=m;
	}
	void show()
	{
		System.out.println("The details of the car :");
		System.out.println(serialNumber+
		price+
		type+
		manufacturer+
		model);
	}
	public static void main(String[] args)
	{
		Mobile apple12=new Mobile(serialNumber++,150000,"IOS","Apple","i phone 12 pro max");
		apple12.show();
		
	}
}
