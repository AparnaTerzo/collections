import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();
        map.put("apar",12);
        map.put("anu",45);

        for(Map.Entry<String,Integer> mapp: map.entrySet()){
            System.out.println(mapp.getKey());
            System.out.println(mapp.getValue());
        }
    }
}
