import java.io.File;
import java.io.IOException;
public class FileDelete {
    public static void main(String args[])throws IOException
    {
        File f = new File("D://Files//rawat.txt");
        f.createNewFile();
        if(f.delete())
            System.out.println("File deleted.");
        else
            System.out.println("File already deleted.");
    }
}
