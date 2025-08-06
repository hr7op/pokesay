import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {

        try (FileReader file = new FileReader("D:\\OneDrive\\Desktop\\Ben10\\alien\\ascii\\004.txt")) {
            int data = file.read();
            while (data != -1) {
                System.out.print((char) data);
                data = file.read();
            }
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
