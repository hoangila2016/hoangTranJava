package QuanLySach;


public class Sach {
	private String tenSach;
	private double giaBan;
	private TacGia tacGia;
	private int nxb;
	public Sach()
	{
		tenSach="NULL";
		giaBan=0;
		tacGia=new TacGia();
		nxb=2000;
	}
	public Sach(String ten,double gia,int xb,String tenTG,ngayThang nsTacGia)
	{
		tenSach=ten;
		giaBan=gia;
		tacGia=new TacGia(tenTG,nsTacGia);
		nxb=xb;
	}
	public Sach(String ten,double gia,int xb,String tenTG,int ngay,int thang,int nam)
	{
		tenSach=ten;
		giaBan=gia;
		tacGia=new TacGia(tenTG,ngay,thang,nam);
		nxb=xb;
	}
	public String toString()
	{
		return "Tên sách: "+tenSach+"\tGiá: "+giaBan+"\tNăm xuất bản:"+nxb+"\tTác Giả: "+tacGia;
	}
	public void inTenSach()
	{
		System.out.print(tenSach);
	}
	public boolean trungNam(Sach a)
	{
		return a.nxb==this.nxb?true:false;
	}
	public void giamGiaX(double x)
	{
		giaBan=giaBan-giaBan*x/100;
		System.out.println("Giá sau khi giảm còn:"+giaBan);
	}
	
}
