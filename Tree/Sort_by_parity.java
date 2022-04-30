import java.util.Arrays;

public class Sort_by_parity {
    public static void main(String[] args) {
        int[] nums={0};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
    static int[] sortArrayByParity(int[] nums) {
        int c=0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                temp=nums[i];
                nums[i]=nums[c];
                nums[c]=temp;
                c++;
            }
        }
        return nums;
    }
}
