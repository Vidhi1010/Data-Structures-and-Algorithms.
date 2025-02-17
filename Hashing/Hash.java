import java.util.*;

public class Hash {
    public static void main(String[] args) {

        // Creating an empty HashMap
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert - O(1)
        hm.put("India",135);
        hm.put("China",150);
        hm.put("US",50);

        System.out.println(hm);

        //Get - O(1)
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("UK"));//null


        //containsKey - O(1)
        System.out.println(hm.containsKey("India"));//true
        System.out.println(hm.containsKey("UK"));//false


        //Remove - O(1)
        //System.out.println(hm.remove("China"));
        System.out.println(hm);

        //Size - O(1)
        System.out.println(hm.size());

        //isEmpty - O(1)
        hm.clear();
        System.out.println(hm.isEmpty());

        
    }


}


