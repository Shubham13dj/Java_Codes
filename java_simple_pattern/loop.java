import java.util.Scanner;

public class loop{
    public static void main(String arg[]){
        int n,i,sum;
        sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            sum+=i;
            
        }
        System.out.println(sum);
        
    }
}
