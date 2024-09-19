package.structural.adapter
public class Main {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("File1.txt");
        FileSystemComponent file2 = new File("File2.txt");

        Directory directory = new Directory("MyFolder");
        directory.addComponent(file1);
        directory.addComponent(file2);

        directory.showDetails();
    }
}