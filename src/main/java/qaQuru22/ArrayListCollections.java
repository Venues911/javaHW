package qaQuru22;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollections {
        private static final List<Integer> list = new ArrayList<>();

        public static void addList(int A) {
            list.add(A);
        }

        public static void findElements(int A){
            if (list.contains(A))
                System.out.println("Элемент " + A + " найден");
            else
                System.out.println("Элемент " + A + " не найден");
        }

        public static void removeElement(int A){
            int i = 0 ;
            while (i < list.size()){
                if (list.get(i).equals(A))
                    list.remove(i);
                i++;
            }
        }


        public static void main (String[] arg) {
            for (int i = 0; i < 10; i++) {
                addList(i);
            }


            findElements(4);
            findElements(13);

            removeElement(1);
            removeElement(6);
            removeElement(8);

            System.out.println(list);
        }
}
