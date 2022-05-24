package exeption.ClassCastException;

import java.util.ArrayList;
import java.util.List;

public class ClassCastException {



    public static void main(String[] args) {
       Integer number = generateBadList().get(0);
    }

    static List<Integer> generateBadList() {
        ArrayList  arrayList = new ArrayList<>();
        arrayList.add("kg");
        return arrayList;


}
}
