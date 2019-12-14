package collection_Once_Again;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet_Vs_LinkesdHashSet {
    public static void main(String []args){
        HashSet hs=new HashSet();
        hs.add(2);
        hs.add(1);
        hs.add(4);
        hs.add(3);
        hs.add(null);
        hs.add(0);
        System.out.println("HashSet :"+hs);

        LinkedHashSet lhset=new LinkedHashSet();
        lhset.add(2);
        lhset.add(1);
        lhset.add(4);
        lhset.add(3);
        lhset.add(null);
        lhset.add(0);
        System.out.println("LinkedHashSet :"+lhset);
    }
}