package thuchanhlab2;

public class bai2 {
	private bai1 dau1;
	private bai1 dau2;
	public bai2() {
		dau1=new bai1();
		dau2=new bai1();
		}
	public double getDau1X(){
		return dau1.getX();
	}
	public double getDau1Y(){
		return dau1.getY();
	}
	public double getDau2X(){
		return dau2.getX();
	}
	public double getDau2Y(){
		return dau2.getY();
	}
	public void setDau1(double x,double y) {
		dau1.setX(x);
		dau1.setY(y);
	}
	public void setDau2(double x,double y) {
		dau2.setX(x);
		dau2.setY(y);
	}
	public String toString() {
		return "[("+dau1.getX()+","+dau1.getY()+"),("+dau2.getX()+","+dau2.getY()+")]";
	}
	public double doDai()
	{
		double dis=Math.sqrt(Math.pow(dau1.getX()-dau2.getX(), 2)+Math.pow(dau1.getY()-dau2.getY(), 2));
		return dis;
	}
	public String trungDiem()
	{
		double x=(dau1.getX()+dau2.getX())/2;
		double y=(dau1.getY()+dau2.getY())/2;
		return "("+x+";"+y+")";
	}
	public boolean doanThang(bai2 a,bai2 b) {
		return ((a.getDau1X()-a.getDau2X())/(a.getDau1Y()-a.getDau2Y()))==((b.getDau1X()-b.getDau2X())/(b.getDau1Y()-b.getDau2Y()))?true:false;
	}
	public static void main(String[]args) {
		bai2 a=new bai2();
		a.setDau1(0, 4);
		System.out.println(a.getDau1X());
		System.out.println(a.getDau1Y());
		a.setDau2(0, 0);
		System.out.println(a.getDau2X());
		System.out.println(a.getDau2Y());
		System.out.println(a);
		System.out.println(a.doDai());
		System.out.println("Trung Điểm:"+a.trungDiem());
		bai2 b=new bai2();
		b.setDau1(6, 8);
		b.setDau2(2, 13);
		if(a.doanThang(a, b)==true)
		System.out.println("Song song");
		else System.out.println("không song song");
	}
}
