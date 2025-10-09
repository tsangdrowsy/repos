public class NVien extends Nguoi {
    String maNV;
    float hsL, luong;

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public float getHsL() {
        return hsL;
    }

    public void setHsL(float hsL) {
        this.hsL = hsL;
    }

    public float getLuong() {
        tinhLuong();
        return luong;
    }

    private void tinhLuong() {
        luong = hsL * 2000000;
    }

    public NVien() {
        super();
        maNV = "A001";
        hsL = 3.33f;
        tinhLuong();
    }

    public NVien(String cmd, String hten, String maNV, float hsL) {
        super(cmd, hten);
        this.maNV = maNV;
        this.hsL = hsL;
        tinhLuong();
    }

    public void xuat() {
        super.xuat();
        System.out.println("MaNV: " + maNV + " HSL: " + hsL + " Luong: " + luong);
    }
}
