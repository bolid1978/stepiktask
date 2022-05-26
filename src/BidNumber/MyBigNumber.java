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
        if(number.length() > bigNumber.toString().length()) {
            longNumber = number;
            shortNumber = bigNumber.toString();
        }
        for (int i = shortNumber.length() - 1; i > -1   ; i--) {
            cifra = Integer.parseInt(longNumber.charAt(i) +"") + Integer.parseInt(shortNumber.charAt(i) +"") + transfer;

            if(cifra > 9) {
                cifra %= 10;
                transfer = 1;
            }
            else transfer = 0;

            char revers = Character.forDigit(cifra, 10);
            StringBuilder stringBuilder = new StringBuilder(longNumber);
            stringBuilder.setCharAt(i, revers);
            longNumber = stringBuilder.toString();
           // System.out.println(longNumber);
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
