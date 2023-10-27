package hinhTron;

public class eclipse {
	private double bkLon,bkNho;
	public eclipse(double a,double b)
	{
		bkNho=0;
		bkLon=0;
		if(a>=0)
		bkLon=a;
		if(b>=0&&b<=a)
		bkNho=b;
	}
	public double dienTich()
	{
		return Math.PI*bkLon*bkNho;
	}
	public double chuVi()
	{
		return 2*Math.PI*Math.sqrt((bkLon*bkLon+bkNho*bkNho)/2);
	}
	public void setBKLon(double a)
	{
		bkLon=a;
	}
	public void setBKNho(double a)
	{	
		bkNho=a;
	}
	public double getBKLon()
	{
		return bkLon;
	}
	public double getBKNho()
	{
		return bkNho;
	}
	public String toString()
	{
		return "elipse \t"+dienTich()+"\t"+chuVi();
	}
}
