

package TH4.Abstraction.NhanVien;

public class AbstractionNVien {
      public static void main(String[] args)
    {
        NhanVien nv1= new NVsx("NV001 ", "Nguyen Van A ", 2013, 1998, 2.0, "Nam ", 0);
        NhanVien nv2=new NVkd("NV002", "Nguyen Van B", 2013, 2006, 2.0, "Nu", 1500, 3000);
        NhanVien nv3=new CBql("NV003","Nguyen Van C", 2009, 1994, 3.0, "Nam", 3, "Giam Doc");


       
        nv1.HienThi();
        nv2.HienThi();
        nv3.HienThi();
    }



}
