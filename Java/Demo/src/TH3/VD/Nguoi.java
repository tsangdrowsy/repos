package TH3.VD;

public class Nguoi {
    String cmnd, hoten;
    String ns;

    public String getcmnd() {
        return cmnd;
    }

    public void setcmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String gethoten() {
        return hoten;
    }

    public void sethoten(String hoten) {
        this.hoten = hoten;
    }

    public String getns() {
        return ns;
    }

    public void setns(String ns) {
        this.ns = ns;
    }

    public Nguoi(String cmnd, String hoten, String ns) {
        this.cmnd = cmnd;
        this.hoten = hoten;
        this.ns = ns;
    }

    public Nguoi() {
        cmnd = "3124411082123456";
        hoten = "Luong Van Hay";
        ns = "20/02/2006";
    }

    public void xuat() {
        System.out.println("Ho ten: " + hoten + " CMND: " + cmnd + " Ngay sinh: " + ns);
    }
}

class test{

      public static void main(String[] args) {
        Nguoi n1 = new Nguoi();
        n1.xuat();
        NhanVien nv1=new NhanVien();
        nv1.xuat();
    }
}
