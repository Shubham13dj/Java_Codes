//Print x^n
public class print_x_tothepower_n{
    public static int print_xto_power_n(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int x_power = print_xto_power_n(x,n-1);
        int xpowernm= x * x_power; 
        return xpowernm;
     }
    public static void main(String arg[]){
        int x=5;
        int n=3;
        int ans=print_xto_power_n(x,n);
        System.out.println(ans);
    }
}

