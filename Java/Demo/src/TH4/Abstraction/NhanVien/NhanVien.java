package TH4.Abstraction.NhanVien;

    import java.time.LocalDate;

    abstract public class NhanVien {
        String maNV, tenNV;
        int nvl, nsinh;
        String sex;
        double hsl;
        protected static double LuongCoBan = 1150;

        public NhanVien(String maNV, String tenNV, int nvl, int nsinh, double hsl, String sex) {
            this.maNV = maNV;
            this.tenNV = tenNV;
            this.nvl = nvl;
            this.nsinh = nsinh;
            this.hsl = hsl;
            this.sex = sex;
        }

        public double PhuCapThamNien() {
            int tn = LocalDate.now().getYear() - nvl;
            if (tn >= 5)
                return tn * NhanVien.LuongCoBan / 100;
            return 0;

        }

         abstract public char XepLoai();

        abstract public double TinhLuong();

        public double ThuNhap() {
            char xl = XepLoai();
            double hsThiDua = 0;
            if (xl == 'A')
                 hsThiDua = 1.0;
            if (xl == 'B')
                 hsThiDua = 0.75;
            if (xl == 'C')
                 hsThiDua = 0.5;
            return hsThiDua * TinhLuong() + PhuCapThamNien();

        }

        

        public void HienThi() {

            System.out.println("MaNV: " + maNV + " tenNV: " + tenNV + " namVaoLam: " + nvl + " namSinh: " + nsinh  + " He So Luong: " + hsl + " Gioi Tinh: " + sex);
           
            System.out.println("\nThuNhap: " + ThuNhap());
            // System.out.println("Diem chu: " + diemChu());
            System.out.println("\n                   ");
        }

    }
