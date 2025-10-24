package TH3.nhanvienn;

public class CBLanhDao extends NhanVien {
    
    private String chucVu;
    private int thamNienQuanLy;


    public CBLanhDao() {
 
        super("NV009", "Dieu Hien", 4.67); 
        this.chucVu = "Giám đốc";
        this.thamNienQuanLy = 10;
    }
    

    public CBLanhDao(String maNV, String tenNV, double heSo, String cv, int thamNien) {

        super(maNV, tenNV, heSo); 
        this.chucVu = cv;
        this.thamNienQuanLy = thamNien;
    }


    private double tinhHeSoLanhDao() {
        String cv = this.chucVu.toLowerCase();

        if (cv.contains("giám đốc")) {
            return 7.0;
        } else if (cv.contains("trưởng phòng")) {
            return 6.0;
        } else if (cv.contains("phó phòng")) {
            return 4.5;
        } else {
            return 1.0; 
        }
    }

    
    @Override
    public double tinhThuNhap() {
       
        double luongNhanVien = super.tinhThuNhap(); 
        

        double heSoLanhDao = tinhHeSoLanhDao();
        double phuCapLanhDao = 1500.0 * heSoLanhDao;
        
        return luongNhanVien + phuCapLanhDao;
    }

 
    @Override
    public void xuat() {
        System.out.println("--- THÔNG TIN CÁN BỘ LÃNH ĐẠO ---");
        System.out.println("Mã nhân viên: " + maNhanVien);
        System.out.println("Tên nhân viên: " + tenNhanVien);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Chức vụ: " + chucVu);
        System.out.println("Thâm niên quản lý: " + thamNienQuanLy + " năm");
        System.out.printf("Thu nhập (bao gồm phụ cấp): %.2f VNĐ\n", tinhThuNhap());
    }
}
