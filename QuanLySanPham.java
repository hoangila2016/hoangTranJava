package btlab2bai3;
import java.util.ArrayList;
public class QuanLySanPham {
	private  ArrayList<SanPham> list;
	public QuanLySanPham()
	{
		list=new ArrayList<SanPham>();
	}
	public void themSanPham(SanPham a)
	{
		list.add(a);
	}
	public void xoaSanPham(SanPham a)
	{
		list.remove(a);
	}
	public void output(int index)
	{
		System.out.println(list.get(index));
	}
	public boolean timKiem(String ten,String mota,String ngayPhatHanh)
	{
		boolean tim=false;
		for(SanPham i:list)
		{
			if(i.getTen()==ten&&i.getMoTA()==mota&&i.getNXS()==ngayPhatHanh)
				return true;
				
		}
		return false;
	}
	public void sapXep()
	{
		list.sort((i,j)->i.getGia()>j.getGia()?-1:1);
	}
	
}
