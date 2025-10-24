package TH4.Abstraction.ChungCu;

public class CH_B extends chungcu {


    public CH_B(String tenCH, String diaChi, double chisoNuocCu, double chisoNuocMoi) {
        super(tenCH, diaChi, chisoNuocCu, chisoNuocMoi);
    }

    @Override
    public double tinhNuoc() {
        return chisoNuocMoi-chisoNuocCu-20;
    }
}
