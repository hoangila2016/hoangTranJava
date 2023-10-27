package (default package);
public class phanSo {
	private int tu;
	private int mau;
	public phanSo() {
		tu=0;
		mau=1;
	}
	public phanSo(int tu, int mau)
	{
		this.tu=tu;
		this.mau=mau!=0?mau:1;
	}
	public int uocSo()
	{
		int c=0;
		int us=1;
		if(tu!=0&&mau!=0)
		{
			if(tu>mau)c=mau;
			else c=tu;
			if(tu%c==0&&mau%c==0)
				us=c;
			else
				for(int i=0;i<=c/2;i++)
				{
					if(tu%i==0&&mau%i==0)
						us=i;
				}
		}
		return us;
	}
}
