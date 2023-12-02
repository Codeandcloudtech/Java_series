interface IPayment{  
double pay(double amount);  
}  
  
class CreditCardPayment implements IPayment{  
public double pay(double amount){
	double amt = amount ;
	amt = amt + 0.05*amt;
	return amt;
	}  
}  
class DebitCardPayment implements IPayment{  
	public double pay(double amount){
		double amt = amount ;
		amt = amt + 0.07*amt;
		return amt;
		}  
}  
//Using interface: by third user  
class Rinterface{  
public static void main(String args[]){  
IPayment d=new CreditCardPayment();
IPayment e=new DebitCardPayment();
System.out.println(d.pay(9999)); 
System.out.println(e.pay(9999)); 
}
}  
