import java.util.Scanner;

public class table{
    public static void main(String arg[]){
        int n,i,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
    if(n==0 || n==1){
        System.out.println("Please enter another number");
    }
    else{
    for(i=2; i<=n/2;i++){
    if(n%i==0){
            flag=1;
        }
    }
    if(flag==1){
        System.out.println("Not prime number");
       } 
    else{
        System.out.println("prime number");

       }
    }
}
}
