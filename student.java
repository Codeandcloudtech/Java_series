class Student {
	public String name,course;
	public int fee;
	Student(){
	name="";
	course="";
	fee=0;
	}
	Student(String n,String c,int f){
		name=n;
		course=c;
		fee=f;
		}

}

class OnlineStudent extends Student{
	 int tax;
	OnlineStudent(String s,String b,int f)
	{
		super(s,b,f);
		tax=5;
	}
}

public class CollectionService extends OnlineStudent
{
	CollectionService(String s,String b,int f)
	{
		super(s,b,f);
	}
void CalculateFee(Student s) {
		this.fee= this.fee+this.fee*this.tax/100;
		
	}
	public static void main(String args[]) {
		CollectionService C=new CollectionService("sakshi","Btech",15000);
	C.CalculateFee(C);
		System.out.println(C.name+" "+C.course+" "+C.fee);
	}

}
