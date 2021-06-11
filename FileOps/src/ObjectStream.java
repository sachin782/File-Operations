import java.io.FileInputStream; 
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.Serializable;
class ObjectStream implements Serializable
{ 
    private final String name;
    private String gender;
    private int age;
    public ObjectStream(String n)
    {
		this.name = n;
    }
    public void setGender(String gender)
    {
		this.gender = gender;
    }
    public void setAge(int age)
    {
		this.age = age;
    }
    @Override
    public String toString()
    {
		return "Name=" + this.name + "\nAge=" + this.age + "\nGender=" + this.gender +"\n";
    }
    public static void main(String[] args) throws IOException,ClassNotFoundException  
    { 
        FileOutputStream fout = new FileOutputStream("D://Files//Streams//singh.ser"); 
        ObjectOutputStream ot = new ObjectOutputStream(fout); 
        ObjectStream obj = new ObjectStream("Sachin");
        obj.setAge(23);
        obj.setGender("Male");
        System.out.println(obj);
        ot.writeObject(obj); 
        ot.close(); 
        fout.close();
        System.out.println("File written successfully.\n");
          
        FileInputStream fin = new FileInputStream("D://Files//Streams//singh.ser"); 
        ObjectInputStream it = new ObjectInputStream(fin); 
        ObjectStream obj1 = (ObjectStream) it.readObject();
        System.out.println(obj1.toString());
        System.out.println("File read successfully."); 
        it.close(); 
    } 
} 