package assignment;

public class Reverse {
	
	String reverse(String a) {
		String temp="";
		for(int i=a.length()-1;i>=0;i--)
		{
			temp=temp+a.charAt(i);
		}
		return temp;
	}

public static void main(String args[]) {
	String s="";
	s="INDIA";
	Reverse A=new Reverse();
	s=A.reverse(s);
	System.out.println(s.charAt(0)+" "+s.charAt(s.length()-1));
}
}
