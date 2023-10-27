package RapChieuPhim;

public class Phim {
	private String tenPhim;
	private int nsx;
	private HangSanXuat studio;
	private double giaVe;
	private ngayChieu date;
	public Phim()
	{
		tenPhim="NULL";
		nsx=2000;
		studio=new HangSanXuat();
		date=new ngayChieu();
		giaVe=0;
	}
	public Phim(String name,ngayChieu d,int nam,double g,HangSanXuat h)
	{
		tenPhim=name;
		nsx=nam;
		if(nam<=0) nsx=2000;
		studio=h;
		date=d;
		giaVe=g;
	}
	public Phim(String name,int ngay,int thang,int year,int nam,double g,String tenHang,String qg)
	{
		tenPhim=name;
		nsx=nam;
		if(nam<=0) nsx=2000;
		studio=new HangSanXuat(tenHang,qg);
		date=new ngayChieu(ngay,thang,nam);
		giaVe=g;
	}
	public boolean kiemTraGiaVe(Phim a)
	{
		if(this.giaVe>a.giaVe)
			return true;
		return false;
	}
	public void inTenHang()
	{
		System.out.print(studio.getTenHang());
	}
	public void inGiaVeKM(int x)
	{
		System.out.print("Giá vé sau khi giảm:"+(giaVe-giaVe*x/100));
	}
}
