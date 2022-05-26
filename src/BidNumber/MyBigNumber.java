package BidNumber;

public class MyBigNumber implements BigNumber{

    private final String number;

    public MyBigNumber(String number) {
        this.number = number;
    }


    @Override
    public BigNumber add(BigNumber bigNumber) {
        int transfer = 0;
        int cifra = 0;
        String longNumber = bigNumber.toString();
        String shortNumber = number;
//        if(number.length() > bigNumber.toString().length()) {
//            longNumber = number;
//            shortNumber = bigNumber.toString();
//        }
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





}
