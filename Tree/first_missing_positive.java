public class first_missing_positive {
    public static void main(String[] args) {
        int[]arr={3,4,-1,1};
        System.out.println(sort(arr));
    }
    static int sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int temp=arr[i];
            if(arr[i]!=arr[temp]&&arr[i]<=arr.length&&arr[i]>0){
                swap(arr,i,temp);
            }else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return arr.length+1;
    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
