import java.util.Scanner;
public class pattern7 {
       public static void main(String arg[]){
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines");
        n=sc.nextInt();
        for(i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);

            }
            System.out.println("");
        }
     }
    
}
