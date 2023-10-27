package triangle;

public class tamGiacCan extends tamGiac {
	public tamGiacCan(double cDay,double cBen)
	{
		super(cDay,cBen,cBen);
	}
	
	public String toString()
	{
		return "tam giác cân\t"+"diện tích:"+dienTich()+"chu vi:"+chuVi();
	}
}
