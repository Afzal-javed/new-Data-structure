import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

public class Duplicate_nmbr {
    public static void main(String[] args) {
        List<Integer> ans=new ArrayList<>();
        int[] arr={1,4,2,4,5,2,8,9,6,5,9};
        int i=0;
        while(i<arr.length){
                int temp=arr[i]-1;
                if(arr[i]!=arr[temp]){
                    swap(arr,i,temp);
                }
            else{
                i++;
            }
        }
     //   System.out.println(Arrays.toString(arr));
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                ans.add(arr[j]);
            }
        }
        System.out.println(ans);
    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
}
