public class Roated_binary {
    public static void main(String[] args) {
        int[]arr={5,6,1,2,3};
        int target=3;
        int start=0;
        int end=arr.length-1;
        System.out.println(binay(arr,target,start,end));

    }
    static int binay(int[] arr,int target,int start,int end){
        int mid=start+(end-start)/2;
        if(start>end){
            return -1;
        }
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if (target>=arr[start]&&target<=arr[mid]){
                return binay(arr,target,start,mid-1);
            }
            else{
                return binay(arr,target,mid+1,end);
            }
        }
        if(target>=arr[mid]&&target<=arr[end]){
            return binay(arr, target, mid+1, end);
        }
        
            return binay(arr,target,start,mid-1);
        
    }
    
}
