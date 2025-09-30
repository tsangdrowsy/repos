import java.util.*;
import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class DanhSachGiaoVien {
    private List<GiaoVien> danhSach = new ArrayList<>();

    public void docTuFileXML(String filePath) {
        try {
            File file = new File(filePath);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("giaovien");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) node;
                    String ten = e.getElementsByTagName("ten").item(0).getTextContent();
                    int nhom = Integer.parseInt(e.getElementsByTagName("sonhom").item(0).getTextContent());
                    danhSach.add(new GiaoVien(ten, nhom));
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi đọc file XML: " + e.getMessage());
        }
    }

    public void xuatDanhSach() {
        for (GiaoVien gv : danhSach) {
            gv.XuatGV();
        }
    }

    public int tongSoNhom() {
        int tong = 0;
        for (GiaoVien gv : danhSach) {
            tong += gv.getSoNhomHuongDan();
        }
        return tong;
    }

    public void sapXepTheoTen() {
        danhSach.sort(Comparator.comparing(GiaoVien::getTenGV));
    }

    public void sapXepTheoSoNhomGiam() {
        danhSach.sort((a, b) -> b.getSoNhomHuongDan() - a.getSoNhomHuongDan());
    }

    public List<GiaoVien> locGiaoVienNhieuNhom() {
        List<GiaoVien> ketQua = new ArrayList<>();
        for (GiaoVien gv : danhSach) {
            if (gv.getSoNhomHuongDan() > 1) {
                ketQua.add(gv);
            }
        }
        return ketQua;
    }
}