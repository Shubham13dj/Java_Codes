
public class if_array_sorted_or_not{

    public static boolean array_sort(int[] a, int i){
        if(a.length-1==i){
            return true;
        }
        if(a[i]<a[i+1]){
           return  array_sort(a, i+1);
        }
        else{
            return false;
        }
        }
        public static void main(String arg[]){
            int[] arr = {1,2,1,4,5};
            int i = 0;
            boolean result=array_sort(arr,i);
            System.out.println(result);
    }
}
