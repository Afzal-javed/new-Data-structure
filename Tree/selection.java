import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr={0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
        int last=arr.length-i-1;
        int max_ind =maximum(arr,0,last);
        swap(arr,max_ind,last);
        }
        
    }
    static int maximum(int[] arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp=0;
        temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
    
}
