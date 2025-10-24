package TH4.Abstraction.NhanVien;

public class NVsx extends NhanVien{
    private int snn;
    public static double hsNangNhoc=0.1;
 

    public NVsx(String maNV, String tenNV, int nvl,int nsinh, double hsl, String sex,int snn)
    {
        super(maNV, tenNV, nvl, nsinh,hsl,sex);
        this.snn=snn;
    }
    
    @Override
    public char XepLoai()
    {
        if (snn <=1) return 'A';
        if (snn<=3) return 'B';
        if (snn <=5) return 'C';
        return 'D';
    }

    @Override
    public double TinhLuong()
    {
        return hsl*LuongCoBan*(1+hsNangNhoc);
    }
}
