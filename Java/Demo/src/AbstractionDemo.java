public class AbstractionDemo {
    public static void main(String[] args)
    {
        MonHoc mh1= new LyThuyet("L01","Lap Trinh Java", 3, 7.5,8.0);
        MonHoc mh2= new ThucHanh("T01", "Thuc Hanh Java", 2, new double[]{8.0,7.0,9.0,8.5});
        MonHoc mh3= new DoAn("D01", "Do An Java", 3, 9.0,8.5);

        mh1.hienThi();
        mh2.hienThi();
        mh3.hienThi();
    }
}
