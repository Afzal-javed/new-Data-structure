
public class missing_nmbr {
    public static void main(String[] args) {
        int[]arr={3,0,1};
       System.out.println(sort(arr));
        
    }
    static int sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int temp=arr[i];
            if(arr[i]<arr.length&&arr[i]!=arr[temp]){
                swap(arr,temp,i);
            }
            else{
                i++;
            }
        }
       // System.out.println(Arrays.toString(arr));
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
              return j;
            }
        }
       return arr.length;
        
    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
}
