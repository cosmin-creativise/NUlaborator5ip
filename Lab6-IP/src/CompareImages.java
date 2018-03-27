import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;

public class CompareImages {

    String path;
    String md6;
    public CompareImages(String path) throws InvalidImageExtensionException, FilePathException, NoSuchAlgorithmException, IOException {
        this.path = path;
        init();
    }

    public void init() throws InvalidImageExtensionException, FilePathException, NoSuchAlgorithmException, IOException {

        md6 = ProcessImage.getMD5(path);

        for(Map.Entry<Author,List<Exhibit>> entry: Main.hashMap.entrySet()){
            for(Exhibit exh: entry.getValue())
                if(exh.md5.equals(md6)) {
                System.out.println("Your photo is similar to " + exh);
                return;
            }
        }





    }



}
