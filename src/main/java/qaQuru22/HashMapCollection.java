package qaQuru22;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection {

    private static final Map<Integer, String> map = new HashMap<>();


    public static void addMap (Integer a, String b) {
        map.put(a, b);
    }

    public static void findMapElement(Integer a){
        if (map.containsKey(a))
            System.out.println("Find " + a + " key");
        else
            System.out.println("Didn't find " + a + " key");
    }

    public static void removeMap(int a){
        map.remove(a);
    }


    public static void main(String[] args) {
        int i = 0;

        while ( i < 10) {
            addMap( i , "someWord");
            i++;
        }

        findMapElement(7);
        findMapElement(77);

        removeMap(3);
        removeMap(9);
        removeMap(7);

        System.out.println(map.entrySet());
    }

}
