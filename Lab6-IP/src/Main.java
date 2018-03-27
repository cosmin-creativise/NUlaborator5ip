import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class Main{

    public static Map<Author,List<Exhibit>> hashMap = new HashMap<Author,List<Exhibit>>();

    public static void main(String argv[]){

        Author a1 = new Author("Nicolae Grigorescu");
        Author a2 = new Author("Vincent Van Gogh");
        Author a3 = new Author("Leonardo Da Vinci");

        Exhibit e1 = new Exhibit(a1,"Carul cu boi","1897");
        Exhibit e2 = new Exhibit(a2,"Starry Night","1889");
        Exhibit e3 = new Exhibit(a2,"Irises","1889");
        Exhibit e4 = new Exhibit(a3,"Gioconda/Monalisa","1503");

        List<Exhibit> list1 = new ArrayList<Exhibit>();
        List<Exhibit> list2 = new ArrayList<Exhibit>();
        List<Exhibit> list3 = new ArrayList<Exhibit>();

        list1.add(e1);
        list2.add(e2);
        list2.add(e3);
        list3.add(e4);

        hashMap.put(a1,list1);
        hashMap.put(a2,list2);
        hashMap.put(a3,list3);


        new ShowSimilar(e2);
        new ShowMultimedia(e4);

    }

}
