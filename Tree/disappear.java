
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
public class disappear {
    public static void main(String[] args) {
        int[]arr={4,3,2,7,8,2,3,1,7};
        int i=0;
        while(arr.length>i){
            int cur=arr[i]-1;
            if(arr[i]!=arr[cur]){
                swap(arr,cur,i);
            }else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                ans.add(j+1);
            
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
