package qaQuru22;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueCollection {

    // Queue - очередь ; DEQUE - двухсторонняя очередь

    private static final Queue<Integer> queue = new ArrayDeque<>();

    public static void addQueue(int B){
        queue.add(B);
        if (queue.contains(B))
            System.out.println("Find " + B + " element");
        else
            System.out.println("Didn't find " + B + " element");
    }

    public static void removeQueue(int B) {
        queue.remove(B);
    }

    public static void main (String[] args) {
        for (int i = 0 ; i < 10 ; i++){
            addQueue(i);
        }

        addQueue(1);
        addQueue(9);
                    // System.out.println(queue);
        removeQueue(7);
        removeQueue(1);
        removeQueue(4);
                    // System.out.println(queue);

        for (int num : queue){
            System.out.println(num + " , ");
        }
    }



}
