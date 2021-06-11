import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
public class CharStream 
{
 public static void main(String args[])throws IOException,FileNotFoundException
 {
    File f = new File("D://Files//Streams//rawat.txt");
    FileWriter w = new FileWriter(f);
    w.write("My name is Sachin Rawat.");
    System.out.println("File written successfully.\n");
    w.close();
    int t;
    FileReader r = new FileReader(f);
    while((t = r.read())!=-1)
    {
        System.out.print((char)t);
    }
    System.out.println("\nFile read successfully.");
    r.close();
 }
}
