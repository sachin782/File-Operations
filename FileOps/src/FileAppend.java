import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileAppend {
    public static void main(String args[])throws IOException,FileNotFoundException
    {
        FileOutputStream fos = new FileOutputStream(new File("D://Files//sachin003.txt"));
        String st = "Hello World\n";
        byte b[] = st.getBytes();
        fos.write(b);
        Scanner sc = new Scanner(System.in);
        String s = null;
        System.out.print("Enter string to append: ");
        s = sc.nextLine();
        fos.write(s.getBytes(),0,s.length());
        fos.close();
    }   
}
