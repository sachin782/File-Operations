import java.io.File;
import java.io.IOException;
public class FileCreate {
    public static void main(String args[])throws IOException
    {
     File f = new File("D://Files//sachin.txt");
     if(f.createNewFile())
         System.out.println("File created."); 
     else
         System.out.println("File exists."); 
     System.out.println("File name:"+f.getName());
     System.out.println("File path:"+f.getPath());
     System.out.println("File absolute path:"+f.getAbsolutePath());
     System.out.println("File parent:"+f.getParent());
     System.out.println("File exists:"+f.exists());
     System.out.println("File size in bytes:"+f.length());
     System.out.println("\nFile permissions:");
     System.out.println("Is file readable:"+f.canRead());
     System.out.println("Is file writable:"+f.canWrite());
     System.out.println("Is file executable:"+f.canExecute());
     f.setReadable(false); 
     f.setWritable(false);
     f.setExecutable(false);
     System.out.println("\nAfter permissions changed:");
     System.out.println("Is file readable:"+f.canRead());
     System.out.println("Is file writable:"+f.canWrite());
     System.out.println("Is file executable:"+f.canExecute());
     //System.out.println(b);
     }
   }

