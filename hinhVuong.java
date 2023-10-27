package triangle;

public class hinhVuong extends HinhChuNhat {
	public hinhVuong(double cd) {
		super(cd, 0);
	}
	public double dienTich()
	{
		return getChieuDai()*getChieuDai();
	}
	public double chuVi()
	{
		return getChieuDai()*4;
	}
	public String toString()
	{
		return "Hình vuông\t"+"Diện tích:"+dienTich()+"\tchu vi:"+chuVi();
	}
}
