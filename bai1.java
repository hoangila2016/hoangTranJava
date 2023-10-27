package thuchanhlab2;

public class bai1 {
	private double x,y;
	public bai1() {x=0;y=0;}
	public double getX() {return x;}
	public double getY() {return y;}
	public void setX(double hoanhDo) 
	{
		x=hoanhDo;
	}
	public void setY(double tungDo) 
	{
		y=tungDo;
	}
	public double distance(double x1,double y1,double x2,double y2)
	{
		double dis=Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
		return dis;
	}
	public static void main(String[]args)
	{
		bai1 a=new bai1();
		a.setX(10);
		a.setY(7);
		System.out.println(a.getX());
		System.out.println(a.getY());
		bai1 b=new bai1();
		System.out.println(a.distance(a.getX(), a.getY(), b.getX(), b.getY()));
	}
}
