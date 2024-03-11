//Print fibonnanci series
public class fibonnanci_series{
    public static void printfibonnanci_series(int a, int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printfibonnanci_series(b,c,n-1);


        
    }
    public static void main(String arg[]){
        int n=7;
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        printfibonnanci_series(a,b,n-2);
    }
}

