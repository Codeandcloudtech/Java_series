package assignment;

class Pilot {
	
	private int x=0;
	private int y=0;
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public void setX(int a) {
		this.x=a;
	}
	public void setY(int a) {
		this.y=a;
	}
	
	public static void main(String args[])
	{
		Pilot P=new Pilot();
		P.setX(8);
		P.setY(10);
		System.out.println(P.getY()+" "+P.getX());
	}
}

