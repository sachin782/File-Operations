import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class UnzipFile {
    public static void main(String[] args)throws IOException,FileNotFoundException
    {
        Scanner sc = new Scanner(System.in);
        String zipFilePath;
        System.out.print("Enter zipped file path:");
        zipFilePath = sc.nextLine();
        String destDir = "D://Files//Uncompress";
        unzip(zipFilePath, destDir);
    }
    private static void unzip(String zipFilePath, String destDir)throws IOException,FileNotFoundException {
        File dir = new File(destDir);
        if(!dir.exists()) 
            dir.mkdirs();
        FileInputStream fis = new FileInputStream(zipFilePath);
        byte[] buffer = new byte[1024];
        ZipInputStream zis = new ZipInputStream(fis);
        ZipEntry ze = zis.getNextEntry();
        while(ze != null)
        {
            String fileName = ze.getName();
            File newFile = new File(destDir + File.separator + fileName);
            new File(newFile.getParent()).mkdirs();
            FileOutputStream fos = new FileOutputStream(newFile);
            int len;
            while ((len = zis.read(buffer)) > 0)
            {
                fos.write(buffer, 0, len);
            }
            fos.close();
            zis.closeEntry();
            ze = zis.getNextEntry();
        }
        System.out.println("File unzipped.");
        zis.closeEntry();
        zis.close();
        fis.close();  
    }
}
