

public class Execute {
    public static void main(String[] args) {
        
        DSBook dsBook = new DSBook();
        try {
            dsBook.ReadXML();
            dsBook.xuatDS();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}