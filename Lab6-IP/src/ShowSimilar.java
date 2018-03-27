import java.util.List;
import java.util.Map;

public class ShowSimilar {

    public Exhibit exhibit;

    public ShowSimilar(Exhibit exhibit) {

        this.exhibit = exhibit;
        init();
    }

    public void init(){

        for(Map.Entry<Author,List<Exhibit>> entry: Main.hashMap.entrySet()){
            for(Exhibit exh: entry.getValue())
                if(exh.equals(exhibit)){
                    System.out.println(exhibit);
                }
        }

    }







}
