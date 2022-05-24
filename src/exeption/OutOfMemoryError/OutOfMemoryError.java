package exeption.OutOfMemoryError;

import java.util.ArrayList;

public class OutOfMemoryError {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (true){
            arrayList.add(2);
        }
    }
}
