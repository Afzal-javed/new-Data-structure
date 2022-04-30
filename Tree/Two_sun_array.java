
import java.util.Arrays;



public class Two_sun_array {
    public static void main(String[] args) {
        int[] nums={3,2,4};
        int target=6;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    static int[] twoSum(int[] nums, int target) {
        // Arrays.sort(nums);
        int[] arr={-1,-1};
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
            if(nums[i]+nums[j]==target&&i!=j){
                arr[0]=i;
                arr[1]=j;
                return arr;
            }
        }
        }
        return arr;
    }
    
}
