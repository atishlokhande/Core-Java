package collection_Once_Again;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String args[]) {

      //TreeSet..!!!!!!!!!!!!!
        TreeSet ts=new TreeSet();
        System.out.println("TreeSet default size:"+ts.size());
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(0);
        ts.add(2);
        //ts.add(null); //Null Key is not allowed...duplicates not allowed...
        System.out.print("TreeSet:");
        System.out.println(ts);
        System.out.println("After insertion  data the TreeSet size:"+ts.size());

        //TreeMap....!!!!!!!!!!!
        TreeMap tm=new TreeMap();
        System.out.println("TreeMap default size:"+tm.size());
        tm.put(1,1);
        tm.put(3,2);
        tm.put(2,3);
        tm.put(0,null);
        tm.put(4,null);
        // tm.put(null,0);   //Null key is not allowed but null values are allowed
        System.out.print("TreeMap:");
        System.out.println(tm.values());
        System.out.println("After insertion  data the TreeMap size:"+tm.size());

        //HashSet......!!!!!!!!
        HashSet hs=new HashSet();
        System.out.println("HashSet default size:"+hs.size());
        hs.add(1);
        hs.add(3);
        hs.add(2);
        hs.add(0);
        hs.add(null);
       // hs.add(null);                  //Only One Null value is allowed next will not be considered
        System.out.print("HashSet:");
        System.out.println(hs);
        System.out.println("After insertion  data the HashSet size:"+hs.size());

        //HashMap.........!!!!!!!!!!
        HashMap hm=new HashMap();
        System.out.println("HashMap default initial capacity:16");
        hm.put(1,1);
        hm.put(3,2);
        hm.put(2,3);
        hm.put(0,null);
        hm.put(null,0);
        //hm.put(null,2);
        hm.put(4,null);
        hm.put(5,null);
        System.out.print("HashMap:");
        System.out.println(hm.values());
        System.out.println("After insertion  data the HashMap size:"+hm.size());



    }
}
