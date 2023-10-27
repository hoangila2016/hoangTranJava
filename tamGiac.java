package triangle;

public class tamGiac {
	private double a,b,c;
	public tamGiac(double c1,double c2,double c3)
	{
		a=b=c=0;
		if(c1>0)
			a=c1;
		if(c2>0)
			b=c2;
		if(c3>0)
			c=c3;
	}
	public double dienTich()
	{
		double p=(a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	public double chuVi()
	{
		return (a+b+c);
	}
	public void setA(double c1)
	{
		if(c1>0)
			a=c1;
	}
	public void setB(double c2)
	{
		if(c2>0)
			b=c2;
	}
	public void setC(double c3)
	{
		if(c3>0)
			c=c3;
	}
	public double getA()
	{
		return a;
	}
	public double getB()
	{
		return b;
	}
	public double getC()
	{
		return c;
	}
	public String toString()
	{
		return "tam giác \t"+"diện tích:"+dienTich()+"chu vi:"+chuVi();
	}
}
