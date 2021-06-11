import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.file.*;
import java.util.zip.*;
public class ZipFile {
    public static void main(String args[])throws IOException,FileNotFoundException
    {
        File f = new File("D://Files//sachin003.txt");
        String nm;
        nm = f.getName();
        nm = nm.replace(".txt","");
        String zipnm = nm.concat(".zip");
        FileOutputStream fos = new FileOutputStream(zipnm);
        ZipOutputStream zos = new ZipOutputStream(fos);
        zos.putNextEntry(new ZipEntry(f.getName()));
        byte[] b= Files.readAllBytes(Paths.get("D://Files//sachin003.txt"));
	zos.write(b, 0, b.length);
	zos.closeEntry();
	zos.close();
        Path temp = Files.move(Paths.get("C:\\Users\\Sachin\\Documents\\NetBeansProjects\\FileOps\\sachin003.zip"),Paths.get("D:\\Files\\Compress\\sachin003.zip")); 
        System.out.println("File compressed successfully."); 
    }  
}
