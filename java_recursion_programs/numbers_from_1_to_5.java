//Print numbers from 1 to 5 using recursion
public class numbers_from_1_to_5{
    public static void printnm(int n){ 
        if(n>5){
            return;
        }
        System.out.println(n);
        printnm(n+1);
    }
    public static void main(String arg[]){

        printnm(1);
    }
}

