import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.util.Scanner;
public class ZipFiles
{
    public void zipFiles(List<String> files)throws IOException,FileNotFoundException
    {
     FileOutputStream fos = null;
     ZipOutputStream zipOut = null;
     FileInputStream fis = null;
     fos = new FileOutputStream("D://Files//Compress//sachinrawat.zip");
     zipOut = new ZipOutputStream(new BufferedOutputStream(fos));
	for(String filePath:files)
        {
	    File input = new File(filePath);
	    fis = new FileInputStream(input);
	    ZipEntry ze = new ZipEntry(input.getName());
	    System.out.println("Zipping the file: "+input.getName());
	    zipOut.putNextEntry(ze);
	    byte[] tmp = new byte[(int)input.length()];
	    int size = 0;
	    while((size = fis.read(tmp)) != -1)
            {
		zipOut.write(tmp, 0, size);
	    }
	    zipOut.flush();
	    fis.close();
	}
	zipOut.close();
	System.out.println("Files are zipped successfully");
    }
	public static void main(String a[])throws IOException
        {
		ZipFiles mfe = new ZipFiles();
		List<String> files = new ArrayList<String>();
                int i=0;
                Scanner sc = new Scanner(System.in);
                String st;
                System.out.println("Enter file path and -1 to exit:");
                while (i != 1)
                {
                    st = sc.nextLine();
                    if(st.equals("-1"))
                     i=1;
                    else
	    files.add(st);
                }
                mfe.zipFiles(files);
       }
} 