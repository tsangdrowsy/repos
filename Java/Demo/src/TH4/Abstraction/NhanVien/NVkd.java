package TH4.Abstraction.NhanVien;

public class NVkd extends NhanVien {
    private int dsth;
    private int doanhso;
   

    public NVkd(String maNV, String tenNV, int nvl, int nsinh, double hsl, String sex, int dsth, int doanhso) {
        super(maNV, tenNV, nvl, nsinh, hsl, sex);
        this.dsth = dsth;
        this.doanhso = doanhso;
    }

    @Override
    public char XepLoai() {
        if (doanhso >= 2 * dsth)
            return 'A';
        if (doanhso >= dsth)
            return 'B';
        if (doanhso >= dsth * 0.5)
            return 'C';
        else
            return 'D';
    }

    @Override
    public double TinhLuong() {
        
        return hsl * LuongCoBan + (0.15 * (doanhso - dsth));
    }

}
