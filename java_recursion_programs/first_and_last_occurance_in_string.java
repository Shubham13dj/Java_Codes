public class first_and_last_occurance_in_string{
    public static int first = -1;
    public static int last = -1;
    public static void string_reverse(String s, char c, int inx){
        if(inx==s.length()){
            System.out.println(last);
            return;
        }
        if(s.charAt(inx)==c){
            if(first==-1){
                first=inx;
                System.out.println("First occurance is "+inx);
            }
            else{
                last=inx;
            }
        }
        string_reverse(s, c, inx+1);
    }
    public static void main(String arg[]){
        String s = "abcdsdads";
        char c = 'a';

        int inx = 0;
        string_reverse(s,c, inx);
    }
}