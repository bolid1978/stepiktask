package exeption.ClassCastException;

import java.util.ArrayList;
import java.util.List;

public class ClassCastException {



    public static void main(String[] args) {
       Integer number = generateBadList().get(0);
    }

    static List<Integer> generateBadList() {
        ArrayList  arrayList = new ArrayList<>();
       Number number =  new Number() {
           @Override
           public int intValue() {
               return 78;
           }

           @Override
           public long longValue() {
               return 0;
           }

           @Override
           public float floatValue() {
               return 0;
           }

           @Override
           public double doubleValue() {
               return 0;
           }
       };
       arrayList.add(number);


        return arrayList;


}
}
