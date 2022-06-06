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
        // 1.2.1 Если первое число с минусом а второе с плюсом вычитаем из второго первое(отсылаем на вычитание)
        // 1.2.2 Если второе число с минусом а первое с плюсом вычитаем из первого второе(отсылаем на вычитание)
        // 1.2.2 Если оба числа с минусом вычитаем из первого второе(отсылаем на вычитание)
        // 1.2.4 Если минусов нет перед числами делаем сложение

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
        //  2.1.1 Если второе число с минусом  а первое с плюсом идём на сложение так как минус на минус даёт плюс(кидаем в сложение)
        //  2.1.2 Если второе  число с минусом а первое с минусом (делаем вычитание с учётом того того какое число больше по модулю)
        //  2.1.3 Если второе число с плюсом а первое с минусом  (делаем вычитание с учётом того того какое число больше по модулю)
        //  2.1.4 Если второе число с минусом а первое с плюсом  (делаем вычитание с учётом того того какое число больше по модулю)

        //---------Дополниетельные функции которые нужны
        //  2.1 Функция которая складывает два положительных числа (то  есть ответ будет положительным )
        //  2.2 Функция которая  вычитает из большего числа меньше (то  есть ответ будет положительным или ноль)
        //  2.3 Функция которая определяет какое число больше по модулю
        //  2.4 Функция которая определяет знак результата .Для её исполнения нужно реализовать метод кампоре вероятно заодно







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
