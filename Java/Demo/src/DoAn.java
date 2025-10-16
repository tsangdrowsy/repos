class DoAn extends MonHoc {
    private double diemGVHD, diemGVPB;

    public DoAn(String ma, String ten, int soTC, double hd, double pb) {
        super(ma, ten, soTC);
        this.diemGVHD = hd;
        this.diemGVPB = pb;
    }

    @Override
    public double tinhDTB() {
        return (diemGVHD + diemGVPB) / 2;
    }
}
