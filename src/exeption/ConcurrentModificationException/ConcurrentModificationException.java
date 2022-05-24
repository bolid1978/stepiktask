package exeption.ConcurrentModificationException;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationException {
    public static void main(String[] args) {
        List<Integer> fg =  new ArrayList<>();
        fg.add(15);
     genConcurrentModificationException(fg);
    }
   static void genConcurrentModificationException(List<Integer> integers) {
       for (Integer el:integers
            ) {
           integers.add(14);
       }
    }
}
