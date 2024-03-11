//Print sum of first n natural numbers
public class sum_of_n_natural_numbers{
    public static void printsum(int i, int n, int sum){
        if(i>=n){
            System.out.println(sum);
            return;
        }
        sum+=i;
        printsum(i+1,n,sum);
        
    }
    public static void main(String arg[]){
        int i=1;
        int n=10;
        int sum=0;
        printsum(i,n,sum);
    }
}

