//Print numbers from 5 to 1 using recursion
public class numbers_from_5_to_1{
    public static void printnm(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printnm(n-1);
    }
    public static void main(String arg[]){

        printnm(5);
    }
}

