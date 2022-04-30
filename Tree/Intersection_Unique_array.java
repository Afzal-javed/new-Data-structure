import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// import java.lang.reflect.Array;
// import java.util.ArrayList;
// import java.util.LinkedHashSet;
// import java.util.List;
// import java.util.Set;

public class Intersection_Unique_array {
    public static void main(String[] args) {
        int[] nums1={4,9,5},nums2={9,4,9,8,4};
       
          System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<Integer>();
        for(int i =0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    set.add(nums1[i]);
                }
            }
        }
        int[] arr=new int[set.size()];
        int s=0;
        
          for(Integer i:set){
            arr[s++]=i;
          }
        return arr;
    }
}
