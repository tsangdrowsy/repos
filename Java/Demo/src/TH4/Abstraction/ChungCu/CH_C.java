package TH4.Abstraction.ChungCu;

public class CH_C extends chungcu {
    private int soNhanKhauChungCu;

    public CH_C(String tenCH, String diaChi, double chisoNuocCu, double chisoNuocMoi, int soNhanKhauChungCu) {
        super(tenCH, diaChi, chisoNuocCu, chisoNuocMoi);
        this.soNhanKhauChungCu = soNhanKhauChungCu;
    }

    public double tinhNuoc()
    {
        return chisoNuocMoi-chisoNuocCu-(soNhanKhauChungCu*10);
    }

}
