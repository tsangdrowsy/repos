package TH4.Abstraction.GiaoVien;

class Nguoi {
    String hoTen;
    String ngaySinh;
    boolean gioiTinh;

    public Nguoi() {
        this.hoTen = "";
        this.ngaySinh = "01/01/2000";
        this.gioiTinh = true;
    }

    public Nguoi(String hoTen, String ngaySinh, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        if (gioiTinh.equalsIgnoreCase("nu")) {
            this.gioiTinh = false;
        } else {
            this.gioiTinh = true;
        }
    }

    public void Xuat() {
        System.out.println("==============================================");
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Gioi tinh: " + (gioiTinh ? "nam" : "nu"));
    }
}