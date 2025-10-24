package TH4.Abstraction.GiaoVien;

class GiangVien extends Nguoi {
    private String maSo;
    private double luongCoBan;
    private double heSo;
    private String chucVu;

    public GiangVien(String hoTen, String ngaySinh, String gioiTinh,
            String maSo, double luongCoBan, double heSo, String chucVu) {
        // Gọi constructor lớp cha (Nguoi)
        super(hoTen, ngaySinh, gioiTinh);

        // Gán mã số
        this.maSo = maSo;

        // Gán lương cơ bản
        this.luongCoBan = luongCoBan;

        // Kiểm tra hệ số hợp lệ
        if (heSo == 2.34 || heSo == 2.67 || heSo == 3.0 || heSo == 3.33) {
            this.heSo = heSo;
        } else {
            this.heSo = 2.34; // mặc định
        }

        // Kiểm tra chức vụ hợp lệ
        if (chucVu.equalsIgnoreCase("trưởng khoa") ||
                chucVu.equalsIgnoreCase("phó khoa") ||
                chucVu.equalsIgnoreCase("giảng viên")) {
            this.chucVu = chucVu.toLowerCase();
        } else {
            this.chucVu = "giảng viên";
        }
    }

    public double tinhLuong() {
        double phuCap;

        if (chucVu.equalsIgnoreCase("trưởng khoa")) {
            phuCap = 5 * luongCoBan;
        } else if (chucVu.equalsIgnoreCase("phó khoa")) {
            phuCap = 4 * luongCoBan;
        } else {
            phuCap = 2 * luongCoBan;
        }

        return luongCoBan * heSo + phuCap;
    }

    @Override
    public void xuatThongTin() {

        System.out.println("Mã số: " + maSo);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Hệ số: " + heSo);
        System.out.println("Chức vụ: " + chucVu);
        System.out.println("Lương thực lĩnh: " + tinhLuong());
    }

}
