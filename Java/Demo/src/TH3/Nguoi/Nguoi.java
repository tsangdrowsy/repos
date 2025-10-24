package TH3.Nguoi;

public class Nguoi {

    protected String hoTen;
    protected String ngaySinh;
    protected String gioiTinh;

    public Nguoi() {
        this.hoTen = "Chưa rõ";
        this.ngaySinh = "01/01/2000";
        this.gioiTinh = "nam";
    }

    public Nguoi(String hoTen, String ngaySinh, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;

        // Kiểm tra tham số giới tính truyền vào
        String gt = gioiTinh.toLowerCase();
        if (gt.equals("nam") || gt.equals("nữ")) {
            this.gioiTinh = gt;
        } else {

            this.gioiTinh = "nam";
        }
    }

    public void xuat() {
        System.out.println(" Họ tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Giới tính: " + gioiTinh);
    }
}

class test {
    public static void main(String[] args) {

        SinhVien sv1 = new SinhVien("Trần Văn Khang", "15/05/2005", "nam",
                "20T102001", "đại học");
        System.out.println(" Sinh viên 1 (Đại học):");
        sv1.xuatSinhVien();

        System.out.println("\n");

        SinhVien sv2 = new SinhVien("Lê Thị Thảo", "01/01/2004", "nữ giới",
                "21CD9902", "Cao Đẳng Nghề");
        System.out.println("Sinh viên 2 (Cao đẳng nghề - Giới tính không hợp lệ):");
        sv2.xuatSinhVien();

        System.out.println("\n");

        SinhVien sv3 = new SinhVien("Phạm Hoàng Sơn", "10/12/2003", "NỮ",
                "22CA30405", "Cao Đẳng");
        System.out.println(" Sinh viên 3 (Cao đẳng):");
        sv3.xuatSinhVien();

        System.out.println("\n");

        SinhVien sv4 = new SinhVien("Bùi Văn Dũng", "20/11/2005", "Nam",
                "23TC12345", "Tại chức");
        System.out.println(" Sinh viên 4 (Hệ đào tạo không hợp lệ):");
        sv4.xuatSinhVien();
    }
}
