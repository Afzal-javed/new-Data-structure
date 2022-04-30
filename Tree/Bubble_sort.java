import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] nums={5,2,3,1};
        System.out.println(Arrays.toString(sortArray(nums)));
    }
    static int[] sortArray(int[] nums) {
         int temp=0;
         int i=0;
         int j=0;
        for( i=0;i<nums.length;i++){
            for(j=0;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
    
}
