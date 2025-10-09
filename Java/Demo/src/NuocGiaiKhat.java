public class Nuocgiaikhat extends Hanghoa{
        private String donvitinh;
        private int soluong;
        private double dongia;
        private static double tilechietkhau = 0.9;

        public String getdonvitinh(){
            return donvitinh;
        }
        public int getsoluong(){
            return soluong;
        }
        public double getdongia(){
            return dongia;
        }
        public void setdonvitinh(String donvitinh){
            this.donvitinh=donvitinh;
        }
        public void setsoluong(int soluong){
            this.soluong=soluong;
        }
        public void setdongia(double dongia){
            this.dongia=dongia;
        }

        public Nuocgiaikhat(String mahang, String tenhang, String donvitinh, int soluong, double dongia){
            super(mahang, tenhang);
            this.donvitinh=kiemtradonvitinh(donvitinh);
            this.soluong=soluong;
            this.dongia=dongia;
        }
        private String kiemtradonvitinh(String donViTinh) {
        if (donViTinh == null)
            return "két";
        donViTinh = donViTinh.toLowerCase();
        if (donViTinh.equals("két") || donViTinh.equals("thùng") ||
            donViTinh.equals("chai") || donViTinh.equals("lon")) {
            return donViTinh;
        } else {
            return "két";
        }
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Don vi tinh:"+donvitinh);
        System.out.println("So luong: "+soluong);
        System.out.println("Don gia: "+dongia);
        System.out.println("tongtien:"+tongtien());
    }
    public double tongtien() {
    double thanhtien;

    if (donvitinh.equals("két") || donvitinh.equals("thùng")) {
        thanhtien = soluong * dongia;
    } 
    else if (donvitinh.equals("chai")) {
        thanhtien = soluong * dongia / 20;
    } 
    else if (donvitinh.equals("lon")) {
        thanhtien = soluong * dongia / 24;
    } 
    else {
        thanhtien = soluong * dongia; // mặc định
    }

    // Tổng tiền sau chiết khấu
    return thanhtien * tilechietkhau;
    }

    public static void main(String[] args){
        Nuocgiaikhat a1 = new Nuocgiaikhat("HH002","Pessi","thùng",3,150000);
        a1.xuat();
    }
}