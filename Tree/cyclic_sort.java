import java.util.Arrays;

public class cyclic_sort {
    public static void main(String[] args) {
        int[]arr={1,5,4,3,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int corr=arr[i]-1;
            if(arr[i]!=arr[corr]){
                swap(arr,i,corr);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp; 
    }
    
}
