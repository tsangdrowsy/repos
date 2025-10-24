package TH3.NhanVien;

import java.time.Year;
import java.util.Scanner;

public class NhanVien {
    private String manv;
    private String hoten;
    private int namvaolam;
    private float hsl;
    private int songaynghi;
    // Lương cơ bản 
    public static final double Luong_co_ban=1150;

    public String getmanv(){
        return manv;
    }

    public void setmanv(String manv){
        this.manv=manv;
    }

    public String gethoten(){
        return hoten;
    }

    public void sethoten(String hoten){
        this.hoten=hoten;
    }

    public int getnam(){
        return namvaolam;
    }

    public void setnamvaolam(int namvaolam){
        this.namvaolam=namvaolam;
    }

    public float gethsl(){
        return hsl;
    }

    public void sethsl(float hsl){
        this.hsl=hsl;
    }

    public int getsongaynghi(){
        return songaynghi;
    }
    
    public void setsongaynghi(int songaynghi){
        this.songaynghi=songaynghi;
    }
    public NhanVien(){
        manv="";
        hoten="";
        namvaolam = Year.now().getValue();
        hsl=1.0f;
        songaynghi=0;
    }
    public NhanVien(String manv, String hoten, float hsl){
        this.manv=manv;
        this.hoten=hoten;
        this.hsl=hsl;
        this.namvaolam= Year.now().getValue();
        this.songaynghi=0;
    }
    
    public NhanVien(String manv, String hoten, float hsl, int namvaolam, int songaynghi){
        this.manv=manv;
        this.hoten=hoten;
        this.hsl=hsl;
        this.namvaolam=namvaolam;
        this.songaynghi=songaynghi;
    }

    public double tinhphucap(){
        int namhientai = Year.now().getValue();
        int sonamlamviec = namhientai - namvaolam;
        if(sonamlamviec>=5){
            return sonamlamviec * Luong_co_ban/100;
        }
        return 0;
    }
    public double tinhluong(){
        return (Luong_co_ban * hsl * hesothidua() + tinhphucap());
    }
    public char xetthidua(){
        if(songaynghi<=1) return 'A';
        else if(songaynghi<=3) return 'B';
        else return 'C';
    }
    private double hesothidua(){
        char loai =xetthidua();
        switch (loai) {
            case  'A': return 1.0;  
            case 'B': return 0.75;
            default: return 0.5;
        }
    }

    public void nhapthongtin(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Nhap ma nhan vien: ");
        manv= scan.nextLine();
        System.out.println("Nhap ho ten nhan vien: ");
        hoten= scan.nextLine();
        System.out.println("Nhap nam vao lam: ");
        namvaolam= scan.nextInt();
        System.out.println("Nhap he so luong: ");
        hsl= scan.nextFloat();
        System.out.println("Nhap so ngay nghi: ");
        songaynghi= scan.nextInt();
    }
    public void xuat(){
        System.out.println("Ma cua nhan vien: "+manv);
        System.out.println("Ho ten nhan vien: "+hoten);
        System.out.println("He so luong: "+hsl);
        System.out.println("So ngay nghi trong thang: "+songaynghi);
        System.out.println("Xep loai thi dua: "+xetthidua());
        System.out.println("Phu cap tham nien: "+tinhphucap());
        System.out.println("Luong: "+ tinhluong());
    }
    
    
    
}

class test {
    public static void main(String[] args){
        NhanVien nv1= new NhanVien("001","TSang",2.5f);
        nv1.xuat();
       
        canbo cb1=new canbo();
        cb1.xuatthongtincanbo();

    }
}