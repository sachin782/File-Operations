import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class FileRead {
    public static void main(String args[])throws IOException,FileNotFoundException
    {
        BufferedReader br = new BufferedReader(new FileReader("D://Files//rawat.txt"));
        String s;
        while((s = br.readLine())!= null)
            System.out.println(s);
    }
}
