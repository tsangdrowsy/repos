package TH4.Abstraction.GiaoVien;

class GiangVien extends Nguoi {
    String maSo;
    double luongCoBan;
    double heSo;
    String chucVu;

    protected static double LuongCoBanGV = 1150.0;

    public GiangVien(String hoTen, String ngaySinh, String gioiTinh, String maSo, double luongCoBan, double heSo, String chucVu) {
        super(hoTen, ngaySinh, gioiTinh);
        this.maSo = maSo;
        this.luongCoBan = LuongCoBanGV;

        if (heSo == 2.34 || heSo == 2.67 || heSo == 3.0 || heSo == 3.3) {
            this.heSo = heSo;
        } else {
            this.heSo = 2.34;
        }

        if (chucVu.equalsIgnoreCase("truong khoa") || chucVu.equalsIgnoreCase("pho khoa") || chucVu.equalsIgnoreCase("giang vien")) {
            this.chucVu = chucVu.toLowerCase();
        } else {
            this.chucVu = "giang vien";
        }
    }

    private double TinhPCCV() {
        if (chucVu.equals("truong khoa")) {
            return 5 * LuongCoBanGV;
        } else if (chucVu.equals("pho khoa")) {
            return 4 * LuongCoBanGV;
        } else {
            return 0;
        }
    }

    public double TinhLuong() {
        return LuongCoBanGV * heSo + TinhPCCV();
    }

    public void Xuat() {
        super.Xuat();
        System.out.println("Ma so: " + maSo);
        System.out.printf("Luong co ban (dung trong tinh toan): %.2f%n", LuongCoBanGV);
        System.out.println("He so luong: " + heSo);
        System.out.println("Chuc vu: " + chucVu);
        System.out.printf("Phu cap chuc vu: %.2f%n", TinhPCCV());
        System.out.printf("Tong luong: %.2f%n", TinhLuong());
    }
}