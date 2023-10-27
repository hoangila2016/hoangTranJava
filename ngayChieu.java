package RapChieuPhim;

public class ngayChieu {
	private int ngay,thang,nam;
	public ngayChieu()
	{
		ngay=thang=1;
		nam=2000;
	}
	public ngayChieu(int d,int m,int y)
	{
		ngay=d;
		thang=m;
		nam=y;
		if(!this.kiemTraNgay())
		{
			ngay=thang=1;
			nam=2000;
		}
	}
	public boolean kiemTraNgay()
	{
		//kiem tra nam nhuan
		boolean namNhuan=true;
		if(nam%4==0&&nam>0)
		{
			if(nam>=100&&nam%400!=0)
				namNhuan=false;
		}
		else
			namNhuan=false;
		//kiem tra ngay thang
		int ngayTrongThang[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(namNhuan)ngayTrongThang[2]=29;
		if(nam>0)
		{
			if(thang>0&&thang<13)
			{
				if(ngay>0&&ngay<=ngayTrongThang[thang])
				{
					return true;
				}
			}
		}
		return false;
	}
	public String toString()
	{
		return ngay+"/"+thang+"/"+nam;
	}
}
