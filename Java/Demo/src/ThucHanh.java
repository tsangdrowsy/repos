class ThucHanh extends MonHoc{
    private double[] diemKT= new double [4];

    public ThucHanh(String ma, String ten, int soTC, double [] diem)
    {
        super(ma, ten, soTC);
        this.diemKT=diemKT;
    }
    
    @Override
    public double tinhDTB()
    {
        double sum =0;
        for (double d: diemKT) sum+=d;
        return sum/4;
    }
}