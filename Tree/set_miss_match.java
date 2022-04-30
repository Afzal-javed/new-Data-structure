import java.util.ArrayList;
import java.util.List;

public class set_miss_match {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 4, 2, 4, 7 };
        sort(arr);
    }
    static void sort(int[] arr) {
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while (i < arr.length) {
            int temp = arr[i] - 1;
            if (arr[i] != arr[temp]) {
                swap(arr, i, temp);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans.add(arr[j]);
                ans.add(j + 1);
            }
        }
        System.out.println(ans);
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
