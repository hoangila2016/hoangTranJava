package bai4Lab2;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class HocVien {
	private static int sl=0;
	private String hoTen,gioiTinh;
	private int ms=0;
	private Date ngaySinh;
	private double diem[];
	public HocVien() {
		diem=new double[] {0,0,0};
		ngaySinh=new Date();
		hoTen=gioiTinh="";
		ms=++sl;
	}
	public String getTen() {
		return hoTen;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public Date getNgaySinh(){
		return ngaySinh;
	}
	public double getDiem1()
	{
		return diem[0];
	}
	public double getDiem2()
	{
		return diem[1];
	}
	public double getDiem3()
	{
		return diem[2];
	}
	// set 
	public void setTen(String a) {
		 hoTen=a;
	}
	public void setGioiTinh(String a) {
		 gioiTinh=a;
	}
	public void setNgaySinh(Date a){
		 ngaySinh=a;
	}
	public void setDiem1(double a)
	{
		 diem[0]=a;
	}
	public void setDiem2(double a)
	{
		 diem[1]=a;
	}
	public void setDiem3(double a)
	{
		 diem[2]=a;
	}
	
	public void nhapThongTin() throws ParseException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập họ tên:");
		String a= sc.nextLine();
		System.out.println("Nhập giới tính:");
		String b= sc.nextLine();
		System.out.println("Nhập ngày tháng năm sinh(dd/mm/yyyy):");
		String c= sc.nextLine();
		SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
		ngaySinh=f.parse(c);
		hoTen=a;
		gioiTinh=b;
	}
	public void nhapDiem() {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Nhập điểm 1:");
		a=sc.nextInt();
		diem[0]=a;
		System.out.println("Nhập điểm 2:");
		a=sc.nextInt();
		diem[1]=a;
		System.out.println("Nhập điểm 3:");
		a=sc.nextInt();
		diem[2]=a;
	}
	public String toString(){
		SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
		return ms+", "+hoTen+", "+gioiTinh+", "+f.format(ngaySinh);
	}
	
}
