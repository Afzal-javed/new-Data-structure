/**
 * selection_sort
 */
import java.util.Arrays;
public class selection_sort {
    
    public static void main (String[] args) {
        int[] arr={5,7,3,1,0};
        selection(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void selection(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maximum=max(arr,0,last);
            swap(arr,maximum,last);
        }
    }
    static void swap(int[] arr,int maximum,int last){
        
       int temp=arr[maximum];
        arr[maximum]=arr[last];
        arr[last]=temp;
    }
    static int max(int[] arr,int start,int end){
        int maxi=arr[start];
        
        for(int j=start;j<=end;j++){
            if(arr[j]>arr[maxi]){
                maxi=j;
            }
        }
        // System.out.println(max);
        return maxi;
    }
}
