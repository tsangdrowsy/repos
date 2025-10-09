import java.util.*;

public class Hanghoa {
    private String MaHang;
    private String TenHang;

    public Hanghoa(String maHang, String tenHang) {
        if (maHang != null && maHang.length() == 5 &&
                maHang.startsWith("HH") &&
                maHang.substring(2).matches("\\d{3}")) {
            this.MaHang = maHang;
        } else {
            this.MaHang = "HH001";
        }
        this.TenHang = tenHang;
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String maHang) {
        this.MaHang = maHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String tenHang) {
        this.TenHang = tenHang;
    }

    public Hanghoa(Hanghoa hh) {
        this.MaHang = hh.MaHang;
        this.TenHang = hh.TenHang;
    }

    public Hanghoa() {
        this.MaHang = " ";
        this.TenHang = " ";
    }

    public void xuat() {
        System.out.println("MaHang: " + MaHang + " | TenHang: " + TenHang);
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ma Hang: ");
        String ma = sc.nextLine();
        if (ma != null && ma.length() == 5 && ma.startsWith("HH") && ma.substring(2).matches("\\d{3}")) {
            this.MaHang = ma;
        } else {
            System.out.println("Ma hang khong hop le, gan mac HH001");
            this.MaHang = "HH001";
        }

        System.out.print("Nhap Ten Hang: ");
        this.TenHang = sc.nextLine();
    }

    public static void main(String[] args) {
        Hanghoa a1 = new Hanghoa("HH002", "Pessi");
        a1.xuat();

        Hanghoa a2 = new Hanghoa();
        a2.nhap();
        a2.xuat();
    }
}