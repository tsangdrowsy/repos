package TH4.Interface.VD3;

interface Printable {

    void print();

    void show();
}

class demo{
    public static void main(String[] args)
    {
           Printable p = new Document(); 
        p.print();
        p.show();
    }
}