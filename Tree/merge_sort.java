import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        int[] ar = { 3, 5, 7, 8, 1, 0, 9, 2 };
        int start = 0;
        int end = ar.length - 1;
        divide(ar, start, end);
        System.out.print(Arrays.toString(ar));
    }

    static void divide(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        merge(arr, start, mid, end);

    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j <= end) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int idx=0,jdx=start;idx<mix.length;idx++,jdx++)
            arr[jdx]=mix[idx];
    }
}
