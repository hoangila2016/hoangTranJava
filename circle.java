package hinhTron;

public class circle extends eclipse {
	
	public circle(double r)
	{
		super(r>=0?r:0,0);
	}
	public double dienTich()
	{
		return Math.PI*getBKLon()*getBKLon();
	}
	public double chuVi()
	{
		return 2*Math.PI*getBKLon();
	}
	public String toString()
	{
		return "circle \t"+dienTich()+"\t"+chuVi();
	}
}
