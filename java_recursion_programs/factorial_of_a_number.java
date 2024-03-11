//Print factorial of a numbers
public class factorial_of_a_number{
    public static int printsum(int n){
        if(n==1 || n==0){
            return 1;
        }
        int factorial=printsum(n-1);
        int fact_nm = n*factorial;
        return fact_nm;
        
    }
    public static void main(String arg[]){
        int n=5;
        int ans=printsum(n);
        System.out.println(ans);
    }
}

