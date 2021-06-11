import java.io.FileWriter;
import java.io.IOException;
public class FileWrite {
    public static void main(String args[])throws IOException
    {
        FileWriter fw = new FileWriter("D://Files//rawat.txt");
        fw.write("Hello World.");
        fw.write("\nHow are you?");
        fw.close();
        System.out.println("File written successfully.");
    }
}

