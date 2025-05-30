import java.util.*;

public class ArrayLists {

    public static void main(String[] args) {
        // size = n............after n limit exceed ->(n + n/2 + 1)
        List<String> name = new ArrayList<>();
        name.add("Vidhi");
        name.add("Vaibhav");
        name.add("Sneha");
        name.add("Vivek");
        name.add(2, "Sweta");
        //name.remove(0);

        //this will directly remove the first occurrence of "Vidhi"
        //name.remove(String.valueOf("Vidhi"));

        System.out.println(name.get(0));
        System.out.println(name);
        System.out.println(name.size());
        System.out.println(name.contains("Vidhi"));
        
        //name.clear();// this will clear whole list

        List<String> list = new ArrayList<>();
        list.add("Aakash");
        list.add("Abhinav");
        System.out.println(list);

        //updating value
        list.set(0, "Akash");

        //adding whole list into another list
        name.addAll(list);
        System.out.println(name);


        /* for(int  i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }
 */
        for(String str: name) {
            System.out.println(str);
        }
    }
}
