package TH4.Abstraction.GiaoVien;

class Nguoi {
    protected String hoTen;
    protected String ngaySinh;
    protected String gioiTinh;

    // Constructor mặc định
    public Nguoi() {
        this.hoTen = "";
        this.ngaySinh = "";
        this.gioiTinh = "nam"; // mặc định là nam
    }

    // Constructor có tham số
    public Nguoi(String hoTen, String ngaySinh, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;

        // kiểm tra giới tính hợp lệ
        if (gioiTinh.equalsIgnoreCase("nam") || gioiTinh.equalsIgnoreCase("nữ")) {
            this.gioiTinh = gioiTinh.toLowerCase();
        } else {
            this.gioiTinh = "nam";
        }
    }

    public void xuatThongTin() {

        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Giới tính: " + gioiTinh);
    }

}

class test {
    public static void main(String[] args) {

        GiangVien gv1 = new GiangVien("Nguyễn Văn A", "12/12/1980",
                "nam", "GV001", 1500000, 3.0, "trưởng khoa");
        GiangVien gv2 = new GiangVien(
                "Trần Thị B", "05/05/1985", "nữ",
                "GV002", 1500000, 2.34, "giảng viên");

        gv1.xuatThongTin();

        gv2.xuatThongTin();
    }
}