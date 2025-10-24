package TH4.Abstraction.GiaoVien;

import java.util.*;

public class Testbai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng giảng viên: ");
        int n = sc.nextInt();
        sc.nextLine(); // bỏ dòng thừa

        GiangVien[] ds = new GiangVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Nhập thông tin giảng viên thứ " + (i + 1) + " ---");

            System.out.print("Họ tên: ");
            String hoten = sc.nextLine();

            System.out.print("Ngày sinh: ");
            String ngaysinh = sc.nextLine();

            System.out.print("Giới tính (nam/nữ): ");
            String gt = sc.nextLine();

            System.out.print("Mã số giảng viên: ");
            String maso = sc.nextLine();

            System.out.print("Lương cơ bản: ");
            double luongCB = sc.nextDouble();

            System.out.print("Hệ số: ");
            double heso = sc.nextDouble();
            sc.nextLine();

            System.out.print("Chức vụ (trưởng khoa / phó khoa / giảng viên): ");
            String chucvu = sc.nextLine();

            ds[i] = new GiangVien(hoten, ngaysinh, gt, maso, luongCB, heso, chucvu);
        }

        System.out.println("\n=== DANH SÁCH GIẢNG VIÊN ===");
        for (GiangVien gv : ds) {
            gv.Xuat();
            System.out.println("---------------------------");
        }
    }
}
