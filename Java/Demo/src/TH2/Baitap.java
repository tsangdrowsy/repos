package TH2;

public class Baitap {
    public static void main(String[] args) {
        HCN hcn = new HCN(4, 6);
        System.out.println("HCN - Chu vi: " + hcn.tinhChuVi());
        System.out.println("HCN - Dien tich: " + hcn.tinhDienTich());

        TamGiac tg = new TamGiac(3, 4, 5);
        System.out.println("Tam giac - Chu vi: " + tg.tinhChuVi());
        System.out.println("Tam giac - Dien tich: " + tg.tinhDienTich());

        NhanVien nv = new NhanVien("Tran Van A", 25);
        nv.inThongTin();

        NuocGiaiKhat.setThueVAT(1.08f); 

        NuocGiaiKhat ngk = new NuocGiaiKhat("Pepsi", "chai", 100, 8000);
        ngk.xuatThongTin();

        System.out.println("\nNhap mat hang moi");
        NuocGiaiKhat ngk2 = new NuocGiaiKhat("", "", 0, 0);
        ngk2.nhapThongTin();
        ngk2.xuatThongTin();
    
    }

}