import java.io.File;
import java.io.FileWriter;

public class FileHandling {
    public static void main(String [] args) throws  Exception{
        System.out.println("Working With File Handling");
        File file = new File("file.txt");
        System.out.println(file.exists());
        file.createNewFile();
        FileWriter fw = new FileWriter(file);
        fw.write("We are working on File neamed file using java");
        fw.close();
    }
}
