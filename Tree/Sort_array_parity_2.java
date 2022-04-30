import java.util.Arrays;

public class Sort_array_parity_2 {
    public static void main(String[] args) {
        int[] nums={3,1,4,2};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }
    static int[] sortArrayByParityII(int[] nums) {
        int even=0;
        int odd=1;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[even]=nums[i];
                even=even+2;
            }
            else{
                arr[odd]=nums[i];
                odd=odd+2;
            }
        }
        return arr;
    }
}
