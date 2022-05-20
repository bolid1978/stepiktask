package reverseBytes;

public class reverseBytes {


    public static void main(String[] args) {
//        String str = "fe01ccd1";
//
//        long d = Long.parseLong(str,16);
        int a = 0xd1cc01fe;
        int d = 0xfe01ccd1;
//        System.out.printf("%H",d);
//        System.out.println();
//        System.out.printf("%H",a);
//        System.out.println();
        //long mask = Long.MAX_VALUE - 1;
        int mask = 0b11111111_11111111_11111111_11111110 ;
        for (int i = 0; i < 32 ; i++) {

            if((d >> i & 1) == 0)  d = d|(1 << i);
            else{

                d = d & mask;}
            mask = (mask << 1) | 1;
        }
        //0xd1cc01fe
        System.out.printf("%H",d);
    }

}
