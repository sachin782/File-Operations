import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class FileRead2 {
    public static void main(String args[])throws IOException,FileNotFoundException
    {
        File f = new File("D://Files//rawat.txt");
        FileInputStream fin = new FileInputStream(f);
        byte s[] = new byte[(int)f.length()];
        fin.read(s);
        String st = new String(s);
        System.out.println(st);
        fin.close();
    }
}
