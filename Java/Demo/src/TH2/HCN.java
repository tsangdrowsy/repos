package TH2;
import java.util.*;
public class HCN {
    private double chieuDai;
    private double chieuRong;

    public HCN(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    //public HCN()
    //{
      //  chieuDai=5;
        //chieuRong=4;
    //}
    public HCN(HCN hcn)
    {
        this.chieuDai=hcn.chieuDai;
        this.chieuRong=hcn.chieuRong;
    }


    //public void HCN(double chieuDai, double chieuRong)
    //{
      //  this.chieuDai=chieuDai;
        //this.chieuRong=chieuRong;
    //}
    public double getChieuDai() {
        return chieuDai;    
    }

   // public void setChieuDai(double chieuDai) {
       // this.chieuDai = chieuDai;
    

    public double getChieuRong() {
        return chieuRong;
    }
  //public void setChieuRong(double chieuRong) {
       //this.chieuRong = chieuRong;
    

    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Chieu Dai: ");
        do chieuDai=sc.nextDouble();
        while (chieuDai<0);
        System.out.println("Nhap Chieu Rong; ");
        do  chieuRong=sc.nextDouble();
        while (chieuRong<0);
        sc.close();
    }
    public void Xuat()
    {
        System.out.println("Chieu dai: "+ chieuDai+" "+"Chieu rong: "+ chieuRong);
    }




}

