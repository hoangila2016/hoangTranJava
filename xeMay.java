package phuongTien;

public class xeMay extends PhuongTienDiChuyen {
	private String loaiNhienLieu;
	public xeMay()
	{
		super();
		loaiPhuongTien="xe may";
		loaiNhienLieu="NULL";
	}
	public xeMay(String nhienLieu,String tenHang,String tenQuocGia)
	{
		super();
		loaiPhuongTien="xe may";
		studio.setTenHangSanXuat(tenHang);
		studio.setTenQuocGia(tenQuocGia);
		loaiNhienLieu=nhienLieu;
	}
	public double vanToc()
	{
		return 40;
	}
}
