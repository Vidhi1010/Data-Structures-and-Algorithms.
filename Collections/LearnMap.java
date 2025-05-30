import java.util.*;
public class LearnMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        //Map<String, Integer> map = new TreeMap<>();

        map.put("One" , 1);
        map.put("Two" , 2);
        map.put("Three" , 3);

        //map.putIfAbsent("Four", 4);
        System.out.println(map);
        map.remove("Three");

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


         
    }
}
