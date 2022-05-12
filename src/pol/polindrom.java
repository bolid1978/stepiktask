package pol;

public class polindrom {
    public static void main(String[] args) {
        String str = "Madam i’m Adam";
        str = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder strRevers = new StringBuilder(str);
       // System.out.println(str);
        strRevers.reverse();
       // System.out.println(strRevers);
        if(str.equals(strRevers.toString())) System.out.println("Yes") ; else System.out.println("No");


    }
}
