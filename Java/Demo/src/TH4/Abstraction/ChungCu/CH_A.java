package TH4.Abstraction.ChungCu;

public class CH_A extends chungcu {
    private double soNhanKhau;

    public CH_A(String tenCH, String diaChi, double chisoNuocCu, double chisoNuocMoi, double soNhanKhau) {
        super(tenCH, diaChi, chisoNuocCu, chisoNuocMoi);
        this.soNhanKhau = soNhanKhau;
    }

    @Override
  public double tinhNuoc() {
      return chisoNuocMoi-chisoNuocCu-5*soNhanKhau;
    }
}


