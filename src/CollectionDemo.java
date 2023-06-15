import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class CollectionDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        for(var coll :collection) {
            System.out.println(coll);
        }


        //addAll method
        Collections.addAll(collection,"a","abb");
        System.out.println(collection);
        System.out.println(collection.size());

        //Removeall

        collection.remove("a");
        System.out.println(collection);

        //Clearall
        collection.clear();
        System.out.println(collection);

        //isEmpty()
        System.out.println(collection.isEmpty());


        //Contains
        Collections.addAll(collection,"a","b","c");
        System.out.println(collection.contains("a"));

        var objectArray =collection.toArray();
        var stringArray=collection.toArray(new String[0]);
        //compare collections

        Collection<String> collection1 = new ArrayList<>();
        collection1.addAll(collection);
        System.out.println(collection1);
        System.out.println(collection.equals(collection1));
    }
}
