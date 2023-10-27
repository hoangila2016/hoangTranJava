package phuongTien;

public class mayBay extends PhuongTienDiChuyen {
	private String loaiNhienLieu;
	public mayBay()
	{
		super();
		loaiPhuongTien="may bay";
		loaiNhienLieu="NULL";
	}
	public mayBay(String nhienLieu,String tenHang,String tenQuocGia)
	{
		super();
		loaiPhuongTien="may bay";
		studio.setTenHangSanXuat(tenHang);
		studio.setTenQuocGia(tenQuocGia);
		loaiNhienLieu=nhienLieu;
	}
	public void catCanh()
	{
		System.out.println("cat canh");
	}
	public void haCanh()
	{
		System.out.println("ha canh");
	}
	public double vanToc()
	{
		return 300;
	}
}
