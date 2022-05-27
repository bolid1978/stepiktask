package BidNumber;

import java.util.Arrays;

public class MyBigNumber implements BigNumber{

    private final String number;

    public MyBigNumber(String number) {
        this.number = number;
    }


    @Override
    public BigNumber add(BigNumber bigNumber) {
        // 1. Выясняем какую операцию делать
        // 1.2 Если одно число с минусом  то
        // 1.2.1 Если первое число с минусом вычитаем из второго первое
        // 1.2.2 Если второе число с минусом вычитаем из первого второе
        // 1.3 Если минусов нет перед числами делаем сложение

        int transfer = 0;
        int cifra = 0;
        String longNumber = bigNumber.toString();
        String shortNumber = number;


        int i = shortNumber.length() - 1;
        int j = longNumber.length() - 1;
        int one = 0;
        int two = 0;
        while (true) {
            if(j >= 0) one = Integer.parseInt(longNumber.charAt(j) + "");
            if(i >= 0) two = Integer.parseInt(shortNumber.charAt(i) + "");
            cifra = one + two + transfer;

            if(cifra > 9) {
                cifra %= 10;
                transfer = 1;
            }
            else transfer = 0;

            char revers = Character.forDigit(cifra, 10);
            StringBuilder stringBuilder = new StringBuilder(longNumber);
            stringBuilder.setCharAt(j, revers);
            longNumber = stringBuilder.toString();

            i--;j--;
            one = two  = 0;

            if(i < 0 && j < 0 ) break;


        }
        //   если transfer равен 1 добавить единицу в строку
        if(transfer == 1) longNumber = "1" + longNumber;



        return new MyBigNumber(longNumber);
    }

    @Override
    public BigNumber sub(BigNumber bigNumber) {
        int transfer = 0;
        int cifra = 0;
        String longNumber = bigNumber.toString();
        String shortNumber = number;

        if(number.length() > bigNumber.toString().length()) {
            longNumber = number;
            shortNumber = bigNumber.toString();
        }
        //
        //  2 выясняем какую операцию делать
        //  2.1 Если второе число с минусом идём на сложение так как минус на минус даёт плюс
        //  2.1.2 Если второе число с плюсом, а мы выполняем вычитание то смотрим на первое
        //  2.1.2.1 Если первое число с минусом выполняем сложение и ставим минус перед ответом
        //  2.1.2.2 Если первое число с плюсом
        //  2.1.2.2.1 Сортируем числа от меньшего к большему
        //  2.1.2.2.2 Вычитаем из большего меньшее
        //  2.1.2.2.3 Ставим минус перед ответом если первое число было меньше второго






        return null;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return number;
    }

    //---------сортирует по модулю по возростанию два числа представленые ввиде стороки
    //-------
    private String[] mass(String numberOne,String numberTwo){
       return null;
    }
    //---------вычитание из большего меньшее
    private String sunMaxMin(String [] str){
        return null;
    }





}
