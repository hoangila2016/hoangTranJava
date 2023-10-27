package QuanLyTaiKhoan;

public class TaiKhoan {
	public static String stk;
	private String ten,sdt,email;
	private ngayThang ngayTao;
	private double soDu;
	public TaiKhoan()
	{
		ten=sdt=email="";
		ngayThang ngayTao=new ngayThang();
		soDu=0;
	}
	public TaiKhoan(String t,String soDienThoai,String mail,ngayThang d,double soDu)
	{
		ten=t;
		sdt=soDienThoai;
		email=mail;
		ngayTao=d;
		this.soDu=soDu;
	}
	public TaiKhoan(TaiKhoan a)
	{
		this.ten=a.ten;
		this.sdt=a.sdt;
		this.email=a.email;
		this.ngayTao=a.ngayTao;
		this.soDu=a.soDu;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ngayThang getNgayTao() {
		return ngayTao;
	}
	public void setNgayTao(ngayThang date) {
		this.ngayTao = date;
	}
	public double getSoDu() {
		return soDu;
	}
	public void setSoDu(double soDu) {
		this.soDu = soDu;
	}
	public String toString()
	{
		return "";
	}
	
	
}
