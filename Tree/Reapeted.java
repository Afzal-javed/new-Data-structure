

public class Reapeted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4,2 };
        // sort(arr);
        System.out.println(sort(arr));
    }

    static int sort(int[] arr) {
        int i = 0;
       
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int temp = arr[i] - 1;
                if (arr[i] != arr[temp]) {
                    swap(arr, i, temp);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }

        }

        return -1;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
