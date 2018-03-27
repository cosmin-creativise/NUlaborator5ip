import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class Main{

    public static Map<Author,List<Exhibit>> hashMap = new HashMap<Author,List<Exhibit>>();

    public static void main(String argv[]) throws IOException, NoSuchAlgorithmException, InvalidImageExtensionException {

        Author a1 = new Author("Nicolae Grigorescu");
        Author a2 = new Author("Vincent Van Gogh");
        Author a3 = new Author("Leonardo Da Vinci");

        Exhibit e1 = new Exhibit(a1,"Carul cu boi","1897");
        Exhibit e2 = new Exhibit(a2,"Starry Night","1889");
        Exhibit e3 = new Exhibit(a2,"Irises","1889");
        Exhibit e4 = new Exhibit(a3,"Gioconda/Monalisa","1503");
        ProcessImage processImage = new ProcessImage();

        e1.setMD5(processImage.getMD5("dates\\Carul cu boi-Nicolae Groigorescu.jpg"));
        System.out.println(e1.md5);
        e2.setMD5(processImage.getMD5("dates\\Gioconda.jpg"));
        System.out.println(e2.md5);
        //e3.setMD5(processImage.getMD5("..\\dates\\Irises-Vincent Van Gogh.jpg"));
        //e4.setMD5(processImage.getMD5("..\\dates\\Starry Night -Vincent Van Gogh.jpg"));
        //System.out.println(md5);


    }

}
