import java.util.Scanner;
public class Merge_Sort{
    void Merge(int arr[], int begin, int middle, int end){
        int i, j, k;  
        int n1 = middle - begin + 1;    
        int n2 = end - middle;    
          
       /* temporary Arrays */  
        int LeftArray[] = new int[n1];  
        int RightArray[] = new int[n2];  
          
        /* copy data to temp arrays */  
        for (i = 0; i < n1; i++)    
        LeftArray[i] = arr[begin + i];    
        for (j = 0; j < n2; j++)    
        RightArray[j] = arr[middle + 1 + j];    
          
        i = 0;   
        j = 0; 
        k = begin;
          
        while (i < n1 && j < n2)    
        {    
            if(LeftArray[i] <= RightArray[j])    
            {    
                arr[k] = LeftArray[i];    
                i++;    
            }    
            else    
            {    
                arr[k] = RightArray[j];    
                j++;    
            }    
            k++;    
        }    
        while (i<n1)    
        {    
            arr[k] = LeftArray[i];    
            i++;    
            k++;    
        }    
          
        while (j<n2)    
        {    
            arr[k] = RightArray[j];    
            j++;    
            k++;    
        }  
    }

    void mergeSort(int arr[], int begin, int end){  
    if (begin < end){  
            int middle = (begin + end) / 2;  
            mergeSort(arr, begin, middle);  
            mergeSort(arr, middle + 1, end);  
            Merge(arr, begin, middle, end);  
        }  
    }
    
    void printArray(int arr[], int n){  
    for (int i = 0; i < n; i++)  
        System.out.print(arr[i] + " ");  
    }
    
    public static void main(String args[]){  
    Scanner scan = new Scanner(System.in); 
    System.out.println("Enter number of elements you want to sort: ");
    int length = scan.nextInt();
    int arr[] = new int[length];
    System.out.println("Enter " +length+ " numbers you want to sort: ");
    for(int i=0; i<arr.length; i++){
        arr[i] = scan.nextInt();
    }
    
    int n = arr.length;  
    Merge_Sort m1 = new Merge_Sort();  
    System.out.println("\nBefore sorting array elements are: ");  
    m1.printArray(arr, n);  
    m1.mergeSort(arr, 0, n - 1);  
    System.out.println("\nAfter sorting array elements are: ");  
    m1.printArray(arr, n);  
    System.out.println("");  

    }
}