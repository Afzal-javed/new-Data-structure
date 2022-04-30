public class Valid_Mountain_Array {
    public static void main(String[] args) {
        int[] arr={0,3,2,1};
        System.out.println(validMountainArray(arr));
    }
    static boolean validMountainArray(int[] arr) {
        if(arr.length>3){
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1]&&arr[i]<arr[i+1]){
                return true;
            }
        }
    }
        return false;
    
    }
}
