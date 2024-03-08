//import java.util.Scanner;

public class stringreverse {
    public static void main(String arg[]){

        StringBuilder n= new StringBuilder("Shbham");
 /*     Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        n=sc.nextLine();*/
        int length = n.length();
        for(int i=0;i<length/2;i++){
           // System.out.println(i);
            char ch=n.charAt(i);
            n.setCharAt(i, n.charAt(length-i-1));
            n.setCharAt(length-i-1,ch);

        }
        System.out.println(n);

    }

}
