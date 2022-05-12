package aaray;
//Работа с массивом
//        Необходимо реализовать функцию:
//        на вход функция получает массив целых чисел;
//        нужно определить максимальную длину подмассива, у которого все элементы возрастают,
//        вычисленную длину вывести в консоль.
//        Sample Input 1:
//        2 1 4 1 2 3 4 5 6 7 3 1
//        Sample Output 1:
//        7
//        Sample Input 2:
//        1 2 3 4 5 6 7 8 9 11
//        Sample Output 2:
//        10
//        Напишите программу.

public class mass {
    public static void main(String[] args) {
       int[] mass = { 2 ,1, 4, 1, 2, 3, 4, 5, 6, 7 ,3, 1};
        //int[] mass = { 1 ,2 ,3, 4 ,5, 6, 7 ,8, 9 ,11};
        //int[] mass = { };
        //int[] mass= {3};
       // int[] mass = {2 ,1 ,4, 1, 2, 3,4 ,5, 6, 7, 7, 7, 7, 7 ,7 ,3, 1, 8, 8 ,8 ,8 ,8 ,8 ,8 ,8 ,8 ,8, 8, 8, 8 ,8 ,8 ,8 ,8 ,8 ,8 ,8 ,8 ,8 ,8, 8 ,8 };
        int max = 1;
        int maxtemp = 1;
        if(mass.length == 0) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < mass.length - 1 ; i++) {
            if(mass[i] <= mass [i + 1] ) {

                if(maxtemp < ++ max ) maxtemp = max;
            }
            else max = 1;
        }
        System.out.println(maxtemp);
    }

}
