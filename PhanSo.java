package baitaplamthemlab2bai1;

public class PhanSo {
	private int tuSo,mauSo;
	private static int soLuongPs = 0;
	public PhanSo() {
	soLuongPs++;
	}
	public void hienThi() {
	System.out.print(soLuongPs);
	}
	public PhanSo(int a)
	{
		if(a!=0)
		tuSo=mauSo=a;
	}
	public PhanSo(int a,int b)
	{
		if(b!=0)
		{
			tuSo=a;
			mauSo=b;
		}
	}
	public PhanSo cong(PhanSo a)
	{
		return new PhanSo (tuSo*a.mauSo+mauSo*a.tuSo,a.mauSo*mauSo);
	}
	public String toString()
	{
		return ""+tuSo+"/"+mauSo;
	}
}
