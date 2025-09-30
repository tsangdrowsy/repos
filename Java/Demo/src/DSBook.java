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

public class DSBook {
    ArrayList<Book> dsBook = new ArrayList<>();
    
    public ArrayList<Book> getDsBook() {
        return dsBook;
    }
    
    public void setDsBook(ArrayList<Book> dsBook) {
        this.dsBook = dsBook;
    }
    
    public DSBook() {
        super();
        this.dsBook = new ArrayList<>();
    }
    
    public void ReadXML() throws ParserConfigurationException, SAXException, IOException {
        File xmlFile = new File("dsBook.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(xmlFile);
        doc.getDocumentElement().normalize();
        
        System.out.println("Root: " + doc.getDocumentElement().getNodeName());
        NodeList nodeList = doc.getElementsByTagName("book");
        
        System.out.println("---");
        
        for (int i = 0; i < nodeList.getLength(); i++) {
            Book b = new Book();
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                b.setId(element.getElementsByTagName("id").item(0).getTextContent());
                b.setAuthor(element.getElementsByTagName("author").item(0).getTextContent());
                b.setTitle(element.getElementsByTagName("title").item(0).getTextContent());
                b.setPrice(Double.parseDouble(element.getElementsByTagName("price").item(0).getTextContent()));
                dsBook.add(b);
            }
        }
    }
    
    public void xuatDS() {
        for (Book b : dsBook) {
            System.out.println("Id: " + b.getId());
            System.out.println("Author: " + b.getAuthor());
            System.out.println("Title: " + b.getTitle());
            System.out.println("Price: " + b.getPrice());
            System.out.println("---");
        }
    }
    
    public void sapxepDS() {
        Collections.sort(dsBook, Book.BookPrice);
        xuatDS();
    }
}