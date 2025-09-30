public class MainGV {
    public static void main(String[] args) {
        DanhSachGiaoVien ds = new DanhSachGiaoVien();

        ds.docTuFileXML("giaovien.xml");

        System.out.println("\n Danh sach ban dau:");
        ds.xuatDanhSach();

        System.out.println("\n Tong So Nhom: " + ds.tongSoNhom());

        System.out.println("\n Sap xep theo so nhom tang dan:");
        ds.sapXepTheoTen();
        ds.xuatDanhSach();

        System.out.println("\n Sap xep theo so nhom giam dan:");
        ds.sapXepTheoSoNhomGiam();
        ds.xuatDanhSach();

        System.out.println("\n GV co so nhom > 1:");
        for (GiaoVien gv : ds.locGiaoVienNhieuNhom()) {
            gv.XuatGV();
        }
    }
}

