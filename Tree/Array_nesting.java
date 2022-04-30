import java.util.HashSet;

public class Array_nesting {
    public static void main(String[] args) {
        int[] nums={5,4,0,3,1,6,2};
        System.out.println(arrayNesting(nums));
    }
    static int arrayNesting(int[] nums){
        HashSet<Integer> ans=new HashSet<>();
        int len=0;
        for(int i=0;i<nums.length;i++){
            int j=i;
            int count=0;
            while(!ans.contains(j)){
                ans.add(j);
                j=nums[j];
                count++;
            }
            len=Math.max(len, count);
        }
        return len;
    }
}
