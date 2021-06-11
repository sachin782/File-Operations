import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.MappedByteBuffer;
public class MappedFiles {
    static int count =20;
    public static void main(String args[])throws Exception
    {
        RandomAccessFile file = new RandomAccessFile("D://Files//MappedFiles//sachin.txt", "rw");
        FileChannel fileChannel = file.getChannel();
        MappedByteBuffer out = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, count);
        out.put("Sachin".getBytes());
        out.put("\nRawat".getBytes());
        System.out.println("Memory Mapped File is written\n");
        System.out.println("File material:");
        for (int i = 0; i < out.limit() ; i++) {
            System.out.print((char) out.get(i));
        }
         System.out.println("\n\nMemory Mapped File is read");
    }
}
