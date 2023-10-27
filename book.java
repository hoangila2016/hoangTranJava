package btlab2bai3;

public class book extends SanPham
{
    private int soTrang;
    public book()
    {
        super();
        super.setMoTa("sach");
        soTrang=0;
    }
     book(String M,String ten,String nhaSanXuat,double gia,int soTrang)
    {
        super(M,ten,"sach",nhaSanXuat,gia);
        this.soTrang=0;
        if(soTrang>0)
        this.soTrang=soTrang;
    }
    public String toString()
    {
        return "ma san pham:"+getMa()+"\tten sanPham"+getTen()+"\tgia"+getGia()+"\tso  trang"+soTrang;
    }
    public void setSoTrang(int soTrang)
    {
        this.soTrang=0;
        if(soTrang>0)
        this.soTrang=soTrang;
    }
}
