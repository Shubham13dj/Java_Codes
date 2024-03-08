import java.util.Scanner;
public class palindrome {
    public static void main(String arg[]){

        String n;
        int flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        n=sc.next();

        int length = n.length();
        for(int i=0;i<length/2;i++){

            if(n.charAt(i)!=n.charAt(length-i-1)){
                flag=1;
                break;
            }

        } 
        if (flag==0) {
            System.out.println("string is palindrome");
            
        }
        else{
            System.out.println("string is not a palindrome");

        }

    }
}

