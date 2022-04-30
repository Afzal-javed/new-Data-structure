import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection_array {
    public static void main(String[] args) {
        int[] nums1={1,2,2,1},nums2={2};
       
          System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
    static int[] intersect(int[] nums1,int[] nums2){
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j]){
                ans.add(nums1[i]);
              
                i++;
                j++;
            }else if(nums2[j]>nums1[i]){

                i++;
            }
            else{
                j++;
            }
        }
        int s=0;
        int[] arr=new int[ans.size()];
        for (Integer k : ans) {
            arr[s++]=k;
        }
        return arr;
    }
}