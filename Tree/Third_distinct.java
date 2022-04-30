import java.util.Arrays;

public class Third_distinct {
    public static void main(String[] args) {
        int[] arr={1,1,2};
        // arr={1,2,4,5,5,8}
        System.out.println(thirdMax(arr));
    }
    static int thirdMax(int[] nums){
         Arrays.sort(nums);
         int j=0;
         for(int i=0;i<nums.length;i++){
             if(nums[j]!=nums[i]){
                 nums[++j]=nums[i];
             }
         }
         System.out.println(Arrays.toString(nums));
         if(j>=2){
             return nums[j-2];
         }
         return nums[j];
        
    }
    
}

