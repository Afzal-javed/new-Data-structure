 import java.util.Arrays;

public class mejority_element {
    public static void main(String[] args) {
        int[] nums = { 3,2,3 };
        System.out.println(majorityElement(nums));
    }

    static int majorityElement(int[] nums) {
        
       Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int count = 0;
         int res=nums[0];
        for(int i=0;i< nums.length; i++){
            if(nums[i]==res){
                count++;
            
                if(count>nums.length/2){
                    return res;
                }
            }
            else{
                res=nums[i];
                count=1;
            }
        }
        return -1;
    }
}
