package TH3.nhanvienn;

public class NhanVien {

    protected String maNhanVien;
    protected String tenNhanVien;
    protected double heSoLuong;


    public static final double LUONG_CO_BAN = 1150.0;


    public NhanVien() {
        this.maNhanVien = "NV001";
        this.tenNhanVien = "Họ tên sinh viên"; 
        this.heSoLuong = 2.34;
    }


    public NhanVien(String maNV, String tenNV, double heSo) {
        // Kiểm tra 2 ký tự đầu của mã nhân viên phải là "NV" (Không phân biệt chữ hoa/thường)
        if (maNV != null && maNV.length() >= 2 && maNV.substring(0, 2).toUpperCase().equals("NV")) {
            this.maNhanVien = maNV;
        } else {
            // Nếu không phù hợp thì mặc định là "NV001"
            this.maNhanVien = "NV001";
        }
        
        this.tenNhanVien = tenNV;
        this.heSoLuong = heSo;
    }

   
    public double tinhThuNhap() {
        return this.heSoLuong * LUONG_CO_BAN;
    }


    public void xuat() {
        System.out.println("--- THÔNG TIN NHÂN VIÊN ---");
        System.out.println("Mã nhân viên: " + maNhanVien);
        System.out.println("Tên nhân viên: " + tenNhanVien);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.printf("Thu nhập: %.2f VNĐ\n", tinhThuNhap()); 
    }
}

class test {

    public static void main(String[] args) {
        

        
  
        NhanVien nv1 = new NhanVien();
        System.out.println("-> Nhân viên 1 (Mặc định):");
        nv1.xuat();

        System.out.println("\n-------------------------------------------------");

    
        NhanVien nv2 = new NhanVien("NV015", "Nguyen Van A", 3.5);
        System.out.println("-> Nhân viên 2 (Mã hợp lệ):");
        nv2.xuat();
        
        System.out.println("\n-------------------------------------------------");
        
    
        NhanVien nv3 = new NhanVien("MNV005", "Tran Thi B", 1.8);
        System.out.println("-> Nhân viên 3 (Mã KHÔNG hợp lệ):");
        nv3.xuat();

        System.out.println("\n\n****************** TEST CÁN BỘ LÃNH ĐẠO ******************");
        
   
        CBLanhDao cbld1 = new CBLanhDao();
        System.out.println("-> Cán bộ Lãnh đạo 1 (Mặc định - Giám đốc):");
        cbld1.xuat();

        System.out.println("\n-------------------------------------------------");


        CBLanhDao cbld2 = new CBLanhDao("NV020", "Le Van C", 5.0, "Trưởng phòng", 5);
        System.out.println("-> Cán bộ Lãnh đạo 2 (Trưởng phòng):");
        cbld2.xuat();

        System.out.println("\n-------------------------------------------------");


        CBLanhDao cbld3 = new CBLanhDao("NV030", "Pham Thi D", 4.0, "Phó phòng", 3);
        System.out.println("-> Cán bộ Lãnh đạo 3 (Phó phòng):");
        cbld3.xuat();
    }
}