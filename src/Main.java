import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        System.out.println(list);

        Collections.addAll(list,"a","b","c","d");
        System.out.println(list);

        //index
        System.out.println(list.get(0));
        //changing the value
        list.set(0,"abi");
        System.out.println(list);

        //remove
        list.remove(0);
        System.out.println(list);

        //return indexof
        System.out.println(list.indexOf("c"));

        //lastIndexof
        System.out.println(list.lastIndexOf("b"));

        //subList
        System.out.println(list.subList(0,3));
    }
}