// import java.sql.Array;
import java.util.Arrays;

public class Array_Partition {
    public static void main(String[] args) {
        int[] nums={6,2,6,5,1,2};
        System.out.println(arrayPairSum(nums));
    }
    static int arrayPairSum(int[] nums) {
        int res=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            res=res+nums[i];
            i++;
        }
        return res;
    }
}
