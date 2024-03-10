import java.util.Scanner;

public class pattern8 {
    public static void main(String arg[]){
        int n,i,number=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println("");
        }
     }
}
