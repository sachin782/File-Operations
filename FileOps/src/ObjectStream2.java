import java.io.FileInputStream; 
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.Serializable;
public class ObjectStream2 implements Serializable{
    public static void main(String args[])throws IOException,ClassNotFoundException
    {
        FileOutputStream fout = new FileOutputStream("D://Files//Streams//rawat.ser"); 
        ObjectOutputStream ot = new ObjectOutputStream(fout); 
        Student obj = new Student();
        obj.nm = "Sachin";
        obj.rn = "RA1912039010003";
        obj.marks = 89;
        obj.cgpa = 8.9;
        System.out.println(obj);
        ot.writeObject(obj); 
        ot.close(); 
        fout.close();
        System.out.println("File written successfully.\n");
          
        FileInputStream fin = new FileInputStream("D://Files//Streams//rawat.ser"); 
        ObjectInputStream it = new ObjectInputStream(fin); 
        Student obj1 = (Student) it.readObject();
        System.out.println(obj1.toString());
        System.out.println("File read successfully."); 
        it.close();         
    }
}
