package collection_Once_Again;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMap_Vs_LinkedHM {
    public static void main(String args[]) {

        HashMap map=new HashMap();
        map.put(3,30);
        map.put(1,40);
        map.put(2,25);
        map.put(0,20);
        //map.put(null,null);
        map.put(null,10);
        System.out.println("HashMap: "+map.values());

        LinkedHashMap lmap=new LinkedHashMap();
        lmap.put(3,30);
        lmap.put(1,40);
        lmap.put(2,25);
        lmap.put(0,20);
        //lmap.put(null,null);
        lmap.put(null,10);
        System.out.println("LinkedHashMap: "+lmap.values());
    }

}
