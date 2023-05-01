public class HeapSort{
    public void sort(int array[])
    {
        int N = array.length;

        for(int i = (N/2)-1; i >= 0; i--)
            heapify(array,N,i);
        
        for(int i = N - 1; i > 0; i--){
            int temp = array[0];
            array[0] = array[1];
            array[1] = temp;

            heapify(array, i, 0);
        }
    }


    void heapify(int array[], int N, int i)  
    {
        int largest = i;
        int left = (2 * i) + 1;
        int right = (2 * i) + 2;

        if(left < N && array[left] > array[largest]) //left side is larger than 1st node
            largest = left;

        if(right < N && array[right] > array[largest]) //right side is larger than largest so far
            largest = right;

        if(largest != i){
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapify(array, N, largest);
        }
    }

    static void printArray(int[] array)
    {
        int N = array.length;

        for(int i = 0; i < N; ++i){
            System.out.println(array[i]+" ");    
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        int array[] = {23,12,54,22,98,10,2,0};
        int N = array.length;

        HeapSort ob = new HeapSort();
        ob.sort(array);
        
        System.out.println("Sorted Array is: ");
        printArray(array);
        
    }
}