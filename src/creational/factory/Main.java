package.creational.singleton
public class Main {
    public static void main(String[] args) {
        DocumentFactory factory = new WordDocumentFactory();
        Document document = factory.createDocument();
        document.open();

        factory = new PDFDocumentFactory();
        document = factory.createDocument();
        document.open();
    }
}