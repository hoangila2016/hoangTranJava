package btlab2bai3;
public class SanPham{
    private String ma,ten,moTa,nxs;
    private double giaBan;
    public SanPham()
    {
        ma=ten=moTa=nxs="NULL";
        giaBan=0;
    }
    public SanPham(String M,String t,String des,String nhaSanXuat,double gia)
    {
        ma=M;
        ten=t;
        moTa=des;
        nxs=nhaSanXuat;
        giaBan=gia;
    }
    public String toString()
    {
        return "ma san pham:"+ma+"ten san pham:"+ten+"mo ta san Pham:"+moTa+"nha san xuat"+nxs+"gia ban:"+giaBan;
    }
    public void setMa(String a)
    {
        ma=a;
    }
    public void setTen(String a)
    {
        ten=a;
    }
    public void setMoTa(String a)
    {
        moTa=a;
    }
    public void setNXS(String a)
    {
        nxs=a;
    }
    public String getMa()
    {
        return ma;
    }
    public String getTen()
    {
        return ten;
    }
    public String getMoTA()
    {
        return moTa;
    }
    public String getNXS()
    {
        return nxs;
    }
    public double getGia()
    {
        return giaBan;
    }
    public void setGia(double gia)
    {
        giaBan=gia;
    }
}
