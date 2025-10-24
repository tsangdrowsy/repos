package TH3.NhanVien;

import java.util.Scanner;
import java.time.Year;

public class canbo extends NhanVien {
    private String chucvu;
    private String phongban;
    private float hspclanhdao;

    public String getchucvu() {
        return chucvu;
    }

    public String getphongban() {
        return phongban;
    }

    public float gethspclanhdao() {
        return hspclanhdao;
    }

    public void setchucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public void setphongban(String phongban) {
        this.phongban = phongban;
    }

    public void sethspclanhdao(float phucap) {
        this.hspclanhdao = phucap;
    }

    // hàm khởi tạo mặc định
    public canbo() {
        super();
        chucvu = "Trưởng phòng";
        phongban = "Phòng hành chính";
        hspclanhdao = 5.0f;
    }

    // hàm khởi tạo có tham số
    public canbo(String chucvu, float hspclanhdao, String manv, String hoten, float hsl) {
        super(manv, hoten, hsl);
        this.setsongaynghi(1);
        this.setnamvaolam(Year.now().getValue());
        this.phongban = "Chưa rõ";
        this.chucvu = chucvu;
        this.hspclanhdao = hspclanhdao;
    }

    // hàm khởi tạo có tham số đầy đủ
    public canbo(String manv, String hoten, String chucvu, float hspclanhdao, float hsl, int namvaolam, String phongban,
            int songaynghi) {
        super(manv, hoten, hsl, namvaolam, songaynghi);
        this.chucvu = chucvu;
        this.phongban = phongban;
        this.hspclanhdao = hspclanhdao;
    }

    @Override // Ghi đè
    public char xetthidua() {
        return 'A';
    }

    // hàm tính phụ cấp cho lãnh đạo
    public double phucaplanhdao() {
        return hspclanhdao * Luong_co_ban;
    }

    @Override
    public double tinhluong() {
        return Luong_co_ban * gethsl() * 1.0 + tinhphucap() + phucaplanhdao();
    }

    // hàm nhập thông tin cán bộ
    public void nhapthongtincanbo() {
        super.nhapthongtin();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuc vu: ");
        chucvu = sc.nextLine();
        System.out.println("Nhap phong ban: ");
        phongban = sc.nextLine();
        System.out.println("Nhap he so phu cap lanh dao: ");
        hspclanhdao = sc.nextFloat();
        sc.close();
    }

    // Xuất thông tin
    public void xuatthongtincanbo() {
        super.xuat();
        System.out.println("Chuc vu: " + chucvu);
        System.out.println("Phong ban: " + phongban);
        System.out.println("Phu cap lanh dao: " + phucaplanhdao());
        System.out.println("Luong can bo: " + tinhluong());
    }

}
