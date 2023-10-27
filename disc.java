package btlab2bai3;

public class disc extends SanPham{
    private double doDai;
    public disc()
    {
        super();
        setMoTa("dia");
        doDai=0;
    }
    public disc(String M,String ten,String nhaSanXuat,double gia,double doDai)
    {
        super(M,ten,"sach",nhaSanXuat,gia);
        this.doDai=doDai;
    }
    public String toString()
    {
        return "ma san pham:"+getMa()+"\tten sanPham"+getTen()+"\tgia"+getGia()+"\tdo Dai:"+doDai;

    }
    public void setDoDai(double doDai)
    {
        this.doDai=0;
        if(doDai>0)
        this.doDai=doDai;
    }
    public double getDoDai()
    {
        return doDai;
    }
}
