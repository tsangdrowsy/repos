package TH4.Abstraction.MonHoc;
abstract class MonHoc {
    protected String maMH;
    protected String tenMH;
    protected int soTC;

    public MonHoc(String maMH, String tenMH, int soTC) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTC = soTC;
    }

    public abstract double tinhDTB();

    public String diemChu() {
        double dtb = tinhDTB();
        if (dtb >= 8.5)
            return "A";
        else if (dtb >= 7.0)
            return "B";
        else if (dtb >= 5.5)
            return "C";
        else if (dtb >= 4.0)
            return "D";
        else
            return "F";
    }


    public void hienThi() {
        System.out.println(maMH + " " + tenMH + " (" + soTC + " tin chi)");
        System.out.println("Diem TB: " + tinhDTB());
        System.out.println("Diem chu: " + diemChu());
        System.out.println("\n                   ");
    }
}

