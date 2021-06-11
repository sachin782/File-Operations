import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class FileTransfer {
    public static void main(String args[])throws IOException,FileNotFoundException
    {
        File f1 = new File("D://Files//sachin.txt");
        File f2 = new File("D://Files//Transfer//sachin.txt");
        FileInputStream fin = new FileInputStream(f1);
        FileOutputStream fos = new FileOutputStream(f2);
        int s;
        while((s = fin.read())!= -1)
            fos.write((char)s);
        fin.close();
        fos.close();
        f1.delete();
        System.out.println("Transfer successfull.");
    }
}
