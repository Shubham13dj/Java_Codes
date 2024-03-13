public class reverse_string{
    public static void string_reverse(String s, int ind){
        if(ind==0){
            System.out.print(s.charAt(ind));
            return;
        }
        System.out.print(s.charAt(ind));
        string_reverse(s,ind-1);    
    }
    public static void main(String arg[]){
        String s = "abcd";
        int ind = s.length();
        string_reverse(s,ind-1);
    }
}

