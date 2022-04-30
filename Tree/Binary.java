

class Binary{
    public static void main(String[] args) {
        int[] arr={2,3,4,6};
        int a=6;
        System.out.println(search(arr,a));

    }
    static int search(int[]arr,int a){
        int first=first_idx(arr,a);
        int last=last_idx(arr,a);
        return last-first+1;
    }
    static int first_idx(int[] arr,int a){
        int start=0;
        int end=arr.length;
        int c=0;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]==a){
                c=mid;
                end=mid-1;
            }else if(arr[mid]>a){
                end=end-1;
            }else{
                start=mid+1;
            }
        }
        return c;
    }
    static int last_idx(int[] arr,int a){
        int start=0;
        int end=arr.length;
        int c=0;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]==a){
                c=mid;
                start=mid+1;
            }else if(arr[mid]>a){
                end=end-1;
            }else{
                start=mid+1;
            }
        }
        return c;
    }
}