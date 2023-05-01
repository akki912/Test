import java.util.*;

public class RandomizedQuickSort {

    public static void main(String[] args) {
        int[] arr = {7, 2, 4, 1, 5, 3};
        randomizedQuickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void randomizedQuickSort(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = randomizedPartition(arr, left, right);
            randomizedQuickSort(arr, left, partitionIndex - 1);
            randomizedQuickSort(arr, partitionIndex + 1, right);
        }
    }

    public static int randomizedPartition(int[] arr, int left, int right) {
        int randomIndex = new Random().nextInt(right - left + 1) + left;
        int temp = arr[randomIndex];
        arr[randomIndex] = arr[right];
        arr[right] = temp;
        return partition(arr, left, right);
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i + 1;
    }

}
