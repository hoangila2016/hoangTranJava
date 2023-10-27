package thuchanhlab2;
import java.util.Scanner;
public class bai3 {
	private bai1 gocTren;
	private bai1 gocDuoi;
	public bai3() {
		gocTren=new bai1();
		gocDuoi=new bai1();
	}
	public boolean kiemTra() {
		if(gocTren.getX()>gocDuoi.getX())
		return false;
		else if(gocTren.getY()<gocDuoi.getY())
			return false;
		else
			return true;
	}
	public void setGocTren(double x,double y) {
		gocTren.setX(x);
		gocTren.setY(y);
	}
	public void setGocDuoi(double x,double y) {
		gocDuoi.setX(x);
		gocDuoi.setY(y);
	}
	public String dienTich()
	{
		bai2 a=new bai2();
		a.setDau1(gocTren.getX(), gocTren.getY());
		a.setDau2(gocTren.getX(), gocDuoi.getY());
		double AD=a.doDai();
		bai2 b=new bai2();
		b.setDau1(gocDuoi.getX(), gocDuoi.getY());
		b.setDau2(gocTren.getX(), gocDuoi.getY());
		double CD=b.doDai();
		return kiemTra()==true?""+AD*CD:"Error";
	} 
	public String chuvi()
	{
		bai2 a=new bai2();
		a.setDau1(gocTren.getX(), gocTren.getY());
		a.setDau2(gocTren.getX(), gocDuoi.getY());
		double AD=a.doDai();
		bai2 b=new bai2();
		b.setDau1(gocDuoi.getX(), gocDuoi.getY());
		b.setDau2(gocTren.getX(), gocDuoi.getY());
		double CD=b.doDai();
		return kiemTra()==true?""+(AD*2+CD*2):"Error";
	}
	public String toString() {
		return "Góc trên:("+gocTren.getX()+","+gocTren.getY()+")\nGóc dưới:("+gocDuoi.getX()+","+gocDuoi.getY()+")\nDiện tích:"+dienTich()+"\nChu vi:"+chuvi();
	}
	public static void main(String []args)
	{
		bai3 a=new bai3();
		a.setGocDuoi(10,0);
		a.setGocTren(0,10);
		a.kiemTra();
		System.out.print(a);
	}
}
