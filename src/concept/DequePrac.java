package src.concept;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequePrac {
    Deque<Integer> dq = new ArrayDeque<>();

    public void hello(){
        dq.peekFirst();
        dq.addFirst(2);
    }


}
