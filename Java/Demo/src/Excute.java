import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Excute {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DSBook dsBook = new DSBook();
        try {
            dsBook.ReadXML();
            dsBook.xuatDS();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}