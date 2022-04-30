import java.util.ArrayList;

class list{
    public static void main(String[] args) {
        int [] arr={12,2,3,4,4,4,4,5,6,7,5,4};
        int target=4;
        int i=0;
        System.out.println(list(arr,target,i));
    }
    static ArrayList<Integer> list(int[]arr,int target,int i){
        ArrayList<Integer> lst=new ArrayList<Integer>();
        if(i==arr.length){
            return lst;
        }
        if(arr[i]==target){
            lst.add(i);
        }
        ArrayList<Integer> ans=list(arr, target, i+1);
        lst.addAll(ans);
        return lst;
    }
}