package phuongTien;

public abstract class PhuongTienDiChuyen {
	protected String loaiPhuongTien;	
	protected HangSanXuat studio;
	public PhuongTienDiChuyen()
	{
		loaiPhuongTien="NULL";
		studio=new HangSanXuat();
	}
	public PhuongTienDiChuyen(String tenPhuongTien,HangSanXuat hangSX)
	{
		loaiPhuongTien=tenPhuongTien;
		studio=hangSX;
	}
	public PhuongTienDiChuyen(String tenPhuongTien,String tenHangSanXuat,String tenQuocGia)
	{
		loaiPhuongTien=tenPhuongTien;
		studio=new HangSanXuat(tenHangSanXuat,tenQuocGia);
	}
	public String getLoaiPhuongTien()
	{
		return loaiPhuongTien;
	}
	public String getHangSanXuat()
	{
		return studio.getTenHangSanXuat();
	}
	public void setLoaiPhuongTien(String ten)
	{
		loaiPhuongTien=ten;
	}
	public void setHangSanXuat(String ten)
	{
		studio.setTenHangSanXuat(ten);
	}
	public void batDau()
	{
		System.out.println("Start");
	}
	public void tangToc()
	{
		System.out.println("Speed");
	}
	public void ketThuc()
	{
		System.out.println("End.");
	}
	public abstract double vanToc();
}
