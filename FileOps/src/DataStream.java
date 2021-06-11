import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
public class DataStream {
    public static void main(String args[])throws IOException,FileNotFoundException
    {
        DataOutputStream dout = new DataOutputStream(new FileOutputStream("D://Files//Streams//sachin.txt"));
        dout.writeDouble(1.1);
        dout.writeInt(123);
        dout.writeChar('a');
        dout.writeBoolean(true);
        System.out.println("File written successfully.");
        
        DataInputStream din = new DataInputStream(new FileInputStream("D://Files//Streams//sachin.txt"));
        double a = din.readDouble();
        int i = din.readInt();
        char c = din.readChar();
        boolean b = din.readBoolean();
        System.out.println("\nFile read successfully.");
        System.out.println(a+" "+i+" "+c+" "+b);
        
    }
}