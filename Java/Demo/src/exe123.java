import java.util.Scanner;

public class exe123 {
    public static void main(String[] args) {

         double x;
         double y;
        HCN hcn = new HCN();
       // hcn.Nhap();

       Scanner sc = new Scanner(System.in);

    System.out.println("Nhap Chieu Dai: ");
      do  x = sc.nextDouble();
      while (x<0);

    

       System.out.println("Nhap Chieu Rong:  ");
       do y = sc.nextDouble();
       while (y<0 || y>x);

       hcn.HCN(x,y);

       System.out.println("\n"+hcn.getChieuDai()+"\n");
       System.out.println(hcn.getChieuRong()+"\n");
        //hcn.Xuat();
        System.out.println("HCN Chu vi: " + hcn.tinhChuVi());
        System.out.println("HCN Dien tich: " +hcn.tinhDienTich());

        //TamGiac tg = new TamGiac(3, 4, 5);
        //System.out.println("Tam giac - Chu vi: " + tg.tinhChuVi());
        //System.out.println("Tam giac - Dien tich: " + tg.tinhDienTich());

        //NhanVien nv = new NhanVien("Tran Van A", 25);
        //nv.inThongTin();
       
        sc.close();
    }

}
