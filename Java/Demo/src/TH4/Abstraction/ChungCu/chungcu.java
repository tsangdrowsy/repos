package TH4.Abstraction.ChungCu;

abstract public class chungcu {
    String tenCH, diaChi;
    double chisoNuocCu, chisoNuocMoi, khoinuoc;

    public chungcu(String tenCH, String diaChi, double chisoNuocCu, double chisoNuocMoi) {
        this.tenCH = tenCH;
        this.diaChi = diaChi;
        this.chisoNuocCu = chisoNuocCu;
        this.chisoNuocMoi = chisoNuocMoi;
    }

    abstract public double tinhNuoc();

    public double tinhTong() {
        return (tinhNuoc() * 8000);
    }

}

class test {
    public static void main(String[] args) {
        chungcu CH1 = new CH_A("a", "b", 0, 25, 3);
        chungcu CH2 = new CH_B("C", "null", 50, 100);
        chungcu CH3 = new CH_C("D", "F", 100, 200, 2);

        System.out.println(CH1.tinhTong());
        System.out.println(CH2.tinhTong());
        System.out.println(CH3.tinhTong());
    }
}
