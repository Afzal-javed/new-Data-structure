import java.util.Arrays;

public class Merge_sorted_array {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int m=3;
        int [] nums2={2,5,6};
        merge(nums1, nums2,m);
    }
    static void merge(int[] nums1,  int[] nums2,int m){
    //  {int i=m;
        int c=0;
       while(m<nums1.length){
           nums1[m]=nums2[c];
           c++;
           m++;
       }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
