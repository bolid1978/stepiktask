package BidNumber;
//         Sample Output 1:
//
//        generate test string:
//        -38027450742057608221309764383410169802626
//        -38027450742057608221309764383410169802626
//
//        add: true. Expected {-76054901484115216442619528766820339605252}, Actual {-76054901484115216442619528766820339605252}
//        sub: true. Expected {0}, Actual {0}
//        cmp: true
//        Sample Input 2:
//
//        generate test string:
//        -20504962648058829508634537240139148734
//        -469915985327887
//
//        add: true. Expected {-20504962648058829508635007156124476621}, Actual {-20504962648058829508635007156124476621}
//        sub: true. Expected {-20504962648058829508634067324153820847}, Actual {-20504962648058829508634067324153820847}
//        cmp: true

public class BigTest {

    public static void main(String[] args) {
        MyBigNumber myBigNumber = new MyBigNumber("5") ;
        System.out.println("98027450742057608221309764383410169802626");
        System.out.println("98027450742057608221309764383410169802626");
        System.out.println(myBigNumber.add(new MyBigNumber("25")));




}
}
