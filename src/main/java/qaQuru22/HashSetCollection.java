package qaQuru22;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollection {

    private static Set<Integer> setMethod = new HashSet<>();

    public static void addSet(int c){
        setMethod.add(c);
    }

    public static void findElement(int c) {
        if (setMethod.contains(c))
            System.out.println("Find " + c + " element");
        else
            System.out.println("Didn't find " + c + " element");
    }



    public static void removeSetElement(int c) {
        setMethod.remove(c);
    }

    public static void main(String[] args) {
        int i = 0 ;

        do {
            addSet(i);
            i++;
        } while (i < 10);

        findElement(3);
        findElement(77);

        removeSetElement(1);
        removeSetElement(3);
        removeSetElement(9);

        System.out.println(setMethod);
    }
}
