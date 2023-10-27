package triangle;

public class HinhChuNhat {
	private double chieuDai,chieuRong;
	public HinhChuNhat(double cd,double cr)
	{
		chieuDai=0;
		chieuRong=0;
		if(cd>=0)
			chieuDai=cd;
		if(cr>=0&&cr<=cd)
			chieuRong=cr;
	}
	public double chuVi()
	{
		return (chieuDai+chieuRong)*2;
	}
	public double dienTich()
	{
		return (chieuDai*chieuRong);
	}
	public String toString()
	{
		return "Hình chữ nhật\t"+"Diện tích:"+dienTich()+"\tchu vi:"+chuVi();
	}
	public void setChieuDai(double a)
	{
		chieuDai=0;
		if(a>=0)
			chieuDai=a;
	}
	public void setChieuRong(double a)
	{
		chieuRong=0;
		if(a>=0&&a<=chieuDai)
			chieuRong=a;
	}
	public double getChieuDai()
	{
		return chieuDai;
	}
	public double getChieuRong()
	{
		return chieuRong;
	}
}
