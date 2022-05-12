package fabinachi;

import java.util.ArrayList;
import java.util.Arrays;

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
//
//        A0 = 0
//
//        A1 = 1
//
//        An+1 = An + An-1
public class fab {


    public static void main(String[] args) {
        //-----решение хорошое
//        void printFibonacci(long n){
//            long x = 0, y = 1;
//            for (long i = 0; i < n; ++i) {
//                long t = y;
//                y = x + y;
//                x = t;
//            }
//            System.out.println(x);
//        }
        //-----решение хорошое два
//        void printFibonacci(long n){
//            BigInteger prev = BigInteger.ZERO;
//            BigInteger cur = BigInteger.ONE;
//            for (long i = 0; i < n; i++)
//            {
//                BigInteger tmp = prev;
//                prev = cur;
//                cur = cur.add(tmp);
//            }
//            System.out.println(prev);
//        }
        //-------решение мое--------
        //-----не очень  есть много но.... но прошло
        ArrayList<Long> cifra = new ArrayList<>();
        cifra.add(0L);
        cifra.add(1L);
        long n  = 6 ;
        for (int i = 2; i < n; i++) {
            long sum = cifra.get(i - 1) + cifra.get(i - 2);
            cifra.add(sum);
           // System.out.println(cifra);
        }
        System.out.println(cifra.get(cifra.size() - 1) + cifra.get(cifra.size() - 2));


    }

}
