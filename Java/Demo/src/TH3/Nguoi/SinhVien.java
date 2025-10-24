package TH3.Nguoi;

public class SinhVien extends Nguoi {

    private String maSoSinhVien;
    private String heDaoTao;
    private int tongSoTinChi;

    private static final int HP_DAI_HOC = 200000;
    private static final int HP_CAO_DANG = 150000;
    private static final int HP_CAO_DANG_NGHE = 120000;

    public SinhVien(String hoTen, String ngaySinh, String gioiTinh,
            String mssv, String heDaoTao) {

        super(hoTen, ngaySinh, gioiTinh);

        this.maSoSinhVien = mssv;

        String hdt = heDaoTao.toLowerCase();
        if (hdt.contains("đại học") || hdt.contains("cao đẳng") || hdt.contains("cao đẳng nghề")) {
            this.heDaoTao = hdt;
        } else {

            this.heDaoTao = "đại học";
        }

        // Thiết lập TỔNG SỐ TÍN CHỈ dựa trên Hệ đào tạo
        if (this.heDaoTao.contains("đại học")) {
            this.tongSoTinChi = 150;
        } else if (this.heDaoTao.contains("cao đẳng nghề")) {
            this.tongSoTinChi = 130;
        } else { // Còn lại là "cao đẳng"
            this.tongSoTinChi = 100;
        }
    }

    private int tinhHocPhiTinChi() {
        if (this.heDaoTao.contains("đại học")) {
            return HP_DAI_HOC;
        } else if (this.heDaoTao.contains("cao đẳng")) {
            return HP_CAO_DANG;
        } else {
            return HP_CAO_DANG_NGHE;
        }
    }

    public double tinhTongHocPhi() {
        return (double) this.tongSoTinChi * tinhHocPhiTinChi();
    }

    public void xuatSinhVien() {
       

        super.xuat();

        System.out.println("Mã số sinh viên: " + maSoSinhVien);
        System.out.println(" Hệ đào tạo: " + heDaoTao.toUpperCase());
        System.out.println(" Tổng số tín chỉ: " + tongSoTinChi);
        System.out.printf(" Tổng học phí (dự kiến): %.0f VNĐ\n", tinhTongHocPhi());
       
    }
}
