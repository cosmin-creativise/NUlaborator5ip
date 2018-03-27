import java.awt.*;
import java.net.URI;
import java.net.URISyntaxException;

public class ShowMultimedia {

    public Exhibit exhibit;

    public ShowMultimedia(Exhibit exhibit) {
        this.exhibit = exhibit;
        init();
    }

    public void init(){
        openWebpage("google",exhibit.getTitle());
    }

    public static boolean openWebpage(URI uri) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(uri);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean openWebpage(String browser,String url) {
        try {
            URI myURI = new URI("https://www."+browser+".com/search?q="+url.replace(" ","%20"));
            return openWebpage(myURI);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return false;
    }


}
