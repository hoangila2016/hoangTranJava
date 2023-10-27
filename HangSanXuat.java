package RapChieuPhim;

public class HangSanXuat{
	private String tenSanXuat,national;
	public HangSanXuat()
	{
		this.national=tenSanXuat="NULL";
		
	}
	public HangSanXuat(String name,String qg)
	{
		this.national=qg;
		this.tenSanXuat=name;
	}
	public HangSanXuat(HangSanXuat a)
	{
		this.national=a.national;
		this.tenSanXuat=a.tenSanXuat;
	}
	public String toString()
	{
		return tenSanXuat+", "+national;
	}
	public String getTenHang()
	{
		return tenSanXuat;
	}
}
