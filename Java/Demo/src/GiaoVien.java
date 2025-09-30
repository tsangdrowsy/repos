
public class GiaoVien {
    private String TenGV;
    private int SoNhomHuongDan;

    public GiaoVien(GiaoVien gv) {
        this.TenGV = gv.TenGV;
        this.SoNhomHuongDan = gv.SoNhomHuongDan;
    }

    public GiaoVien(String TenGV, int SoNhomHuongDan) {
        this.TenGV = TenGV;
        this.SoNhomHuongDan = SoNhomHuongDan;
    }

    public void setTenGV(String TenGV) {
        this.TenGV = TenGV;
    }

    public void setSoNhomHuongDan(int SoNhomHuongDan) {
        this.SoNhomHuongDan = SoNhomHuongDan;
    }

    public String getTenGV() {
        return TenGV;
    }

    public int getSoNhomHuongDan() {
        return SoNhomHuongDan;
    }

    public void XuatGV() {
        System.out.println("Ten Giao Vien: "+TenGV+" "+"So Nhom Huong Dan: "+SoNhomHuongDan);
    }
}