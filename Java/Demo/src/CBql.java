public class CBql extends NhanVien{
    private int hsCV;
    private String tenChucVu;

    public CBql(String maNV, String tenNV, int nvl, int nsinh, double hsl, String sex, int hsCV,String tenChucVu){
    super(maNV, tenNV, nvl, nsinh, hsl, sex);
    this.hsCV=hsCV;
    this.tenChucVu=tenChucVu;

    }
    @Override
    public char XepLoai(){
        return 'A';
    }

    @Override
    public double TinhLuong()
    {
        System.out.print("Chuc vu: "+ tenChucVu);
        return hsl*LuongCoBan+(hsCV*1100);
    }
}
