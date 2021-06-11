import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class FileCopy {
    public static void main(String args[])throws IOException,FileNotFoundException
    {
        File f1 = new File("D://Files//rawat.txt");
        File f2 = new File("D://Files//sachin.txt");
        FileInputStream fin = new FileInputStream(f1);
        FileOutputStream fos = new FileOutputStream(f2);
        int s;
        while((s = fin.read())!= -1)
            fos.write((char)s);
        System.out.println("Copy successfull.");
        fin.close();
        fos.close();
    }
}
