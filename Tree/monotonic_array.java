public class monotonic_array {
    public static void main(String[] args) {
        int[] nums={1,1,0};
        System.out.println(isMonotonic(nums));
    }
    static boolean isMonotonic(int[] nums){
        boolean flag=true;
        if(nums[0]<=nums[nums.length-1]){
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]<=nums[i+1]){
                    flag=true;
                }
                else{
                    flag=false;
                    break;
                }
            }
        }
        if(nums[0]>=nums[nums.length-1]){
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]>=nums[i+1]){
                    flag=true;
                }else{
                    flag=false;
                    break;
                }
            }
        }
        return flag;
    }
    
}
