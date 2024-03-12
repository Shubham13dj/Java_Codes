public class tower_of_hanoi{
    public static void hanoitower(int n, String s, String h, String d){
        if(n==1){
            System.out.println("Transfer Disk"+n+"from"+s+"to"+d);
            return;
        }
        hanoitower(n-1,s,d,h);
        System.out.println("Transfer Disk "+n+" from  "+s+" to "+d);
        hanoitower(n-1,h,s,d);

        
    }
    public static void main(String arg[]){
        int n=2;
        
        hanoitower(n, " Source ", " Helper ", " Destination");
    }
}

