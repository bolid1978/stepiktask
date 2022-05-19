package reverseBytes;

public class reverseBytes {


    public static void main(String[] args) {
        String str = "fe01ccd1";

        long d = Long.parseLong(str,16);
        System.out.println(d);
        //long mask = Long.MAX_VALUE - 1;
        long mask = Long.MAX_VALUE - 1;
        for (int i = 0; i < 64 ; i++) {

            if((d >> i & 1) == 0)  d = d|(1 << i);
            else{
                if(i != 0 )  mask = (mask << i) | 1;
                d = d & mask;
            }
        }
    }

}
