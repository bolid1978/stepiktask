package countingObject;

public class CountObgect {

    public static void main(String[] args) {
     Object[] objects = new Object[] {new Apple() {},new Banana() {},new Orange() {},5};
     checkFruitCount(objects);
    }
    static void checkFruitCount(Object[] objects) {
        int countApple = 0;
        int countBanan = 0;
        for (int i = 0; i < objects.length; i++) {
            if(objects[i] instanceof Apple) countApple++;
            if(objects[i] instanceof Banana) countBanan++;
        }
        System.out.printf("banana=%d, apple=%d",countBanan,countApple);
        // enter your code
    }

    interface Apple {

    }

    interface Banana {

    }
    interface Orange {

    }


}
