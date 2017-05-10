import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Created by nata on 11.05.2017.
 */
public class ReadZIP {
    public static void main(String[] args) {
        try(FileInputStream f = new FileInputStream("Lesson6.zip");
                ZipInputStream zip = new ZipInputStream(f);){
            ZipEntry zipE = null;
            while ((zipE = zip.getNextEntry())!=null){
                System.out.println(zipE.getName());
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
