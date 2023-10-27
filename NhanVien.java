package baitaplamthemlab2bai1;

public class NhanVien {
	public static int dem = 1;
	public static int mssv;
	private String hoTen;
	{
	mssv = dem;
	dem++;
	}
	public  NhanVien(String ht) {
	this.hoTen = ht;
	}
	public static int getDem() {
		return dem;
	}
	public static void setDem(int dem) {
		NhanVien.dem = dem;
	}
	public int getMssv() {
		return mssv;
	}
	public void setMssv(int mssv) {
		this.mssv = mssv;
	}
}
