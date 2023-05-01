import java.util.Scanner;

public class Merge_Sort_Recursive {
    public static void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(array, low, middle);
            mergeSort(array, middle + 1, high);
            merge(array, low, middle, high);
        }
    }

    private static void merge(int[] array, int low, int middle, int high) {
        int[] tempArray = new int[high - low + 1];
        int left = low;
        int right = middle + 1;
        int index = 0;

        while (left <= middle && right <= high) {
            if (array[left] < array[right]) {
                tempArray[index] = array[left];
                left++;
            } else {
                tempArray[index] = array[right];
                right++;
            }
            index++;
        }

        while (left <= middle) {
            tempArray[index] = array[left];
            left++;
            index++;
        }

        while (right <= high) {
            tempArray[index] = array[right];
            right++;
            index++;
        }

        for (index = 0; index < tempArray.length; index++) {
            array[low + index] = tempArray[index];
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        mergeSort(array, 0, size - 1);

        System.out.println("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
