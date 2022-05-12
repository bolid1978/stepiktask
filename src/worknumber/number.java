package worknumber;
//    Необходимо реализовать функцию:
//        на вход функция получает целое число n;
//        значение числа n лежит в диапазоне (1000, 10000);
//        если значение сотни нечетное, умножить это число на два;
//        если значение сотни четное, добавить к этому числу 100;
//        полученное число вывести в консоль.
//        Sample Input 1:
//        1111
//        Sample Output 1:
//        2222
//        Sample Input 2:
//        1211
//        Sample Output 2:
//        1311

public class number {


    public static void main(String[] args) {
        int  a =  1211;
        int c = ((a/100)%10)%2;
        if(c != 0) System.out.println(a*2);
        else System.out.println( a + 100);

    }

}
