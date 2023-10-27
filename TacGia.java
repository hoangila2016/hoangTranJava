package QuanLySach;

public class TacGia {
	private String name;
	private ngayThang date;
	public TacGia(String ten,ngayThang d)
	{
		name=ten;
		date=d;
	}
	public TacGia()
	{
		name="NULL";
		date=new ngayThang();
	}
	public TacGia(String ten,int ngay,int thang,int nam)
	{
		name=ten;
		date=new ngayThang(ngay,thang,nam);
	}
	public String toString()
	{
		return name+", "+date;
	}
}
