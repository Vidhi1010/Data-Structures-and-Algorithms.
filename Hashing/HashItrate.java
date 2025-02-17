import java.util.*;

public class HashItrate {
    
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India",135);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("UK", 20);
        hm.put("Russia", 30);
        hm.put( "Nepal", 10);

        //Iterating over keys
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k: keys){
            System.out.println("key= "+k+ " value= "+hm.get(k));
        }
    }
}
