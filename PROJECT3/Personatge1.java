import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
public class Personatge1 extends Personatges {
    public Personatge1(String nom, int nivell, int puntsDeVida, int puntsDeMana, int danys) {
        super(nom, nivell, puntsDeVida, puntsDeMana, danys);
    }
    public void equiparPersonatge1(String nomArma, int danysArma, String nomArmadura, int puntsDeVidaArmadura, String nomPocio, int puntsDeVidaPocio, int puntsDeManaPocio) {
        try {
            // EQUIPAR ARMA
            File fArma = new File("C:\\Users\\ESPARTA\\Desktop\\PROJECT3\\armes.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document docArma = dBuilder.parse(fArma);
            docArma.getDocumentElement().normalize();
            NodeList nListArma = docArma.getElementsByTagName("arma");
            Node nodeArma = nListArma.item(0);
            if (nodeArma.getNodeType() == Node.ELEMENT_NODE) {
                Element eElementArma = (Element) nodeArma;
                String nomArmaXML = eElementArma.getElementsByTagName("nom").item(0).getTextContent();
                int danysArmaXML = Integer.parseInt(eElementArma.getElementsByTagName("danys").item(0).getTextContent());
                System.out.println("Arma equipada: " + nomArmaXML + ", Danys: " + danysArmaXML);
                this.danys += danysArmaXML;
            }

            // EQUIPAR ARMADURA
            File fArmadura = new File("C:\\Users\\ESPARTA\\Desktop\\PROJECT3\\armadures.xml");
            Document docArmadura = dBuilder.parse(fArmadura);
            docArmadura.getDocumentElement().normalize();
            NodeList nListArmadura = docArmadura.getElementsByTagName("armadura");
            Node nodeArmadura = nListArmadura.item(0);
            if (nodeArmadura.getNodeType() == Node.ELEMENT_NODE) {
                Element eElementArmadura = (Element) nodeArmadura;
                String nomArmaduraXML = eElementArmadura.getElementsByTagName("nom").item(0).getTextContent();
                int puntsDeVidaArmaduraXML = Integer.parseInt(eElementArmadura.getElementsByTagName("puntsDeVida").item(0).getTextContent());
                System.out.println("Armadura equipada: " + nomArmaduraXML + ", Punts de Vida: " + puntsDeVidaArmaduraXML);
                this.puntsDeVida += puntsDeVidaArmaduraXML;
            }

            // EQUIPAR POCIÓ
            File fPocio = new File("C:\\Users\\ESPARTA\\Desktop\\PROJECT3\\pocions.xml");
            Document docPocio = dBuilder.parse(fPocio);
            docPocio.getDocumentElement().normalize();
            NodeList nListPocio = docPocio.getElementsByTagName("pocio");
            Node nodePocio = nListPocio.item(0);
            if (nodePocio.getNodeType() == Node.ELEMENT_NODE) {
                Element eElementPocio = (Element) nodePocio;
                String nomPocioXML = eElementPocio.getElementsByTagName("nom").item(0).getTextContent();
                int puntsDeVidaPocioXML = Integer.parseInt(eElementPocio.getElementsByTagName("puntsDeVida").item(0).getTextContent());
                int puntsDeManaPocioXML = Integer.parseInt(eElementPocio.getElementsByTagName("puntsDeMana").item(0).getTextContent());
                System.out.println("Poció equipada: " + nomPocioXML + ", Punts de Vida: " + puntsDeVidaPocioXML + ", Punts de Mana: " + puntsDeManaPocioXML);
                this.puntsDeVida += puntsDeVidaPocioXML;
                this.puntsDeMana += puntsDeManaPocioXML;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
