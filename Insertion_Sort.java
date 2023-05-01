import java.util.Scanner;
public class Insertion_Sort{
    public static void sort(int M_array[]){
        for(int j = 1; j<M_array.length; j++){
            int key = M_array[j];
            int i = j-1;
            while((i>-1) && (M_array[i]>key)){
                M_array[i+1] = M_array[i];
                i--;
            }
            M_array[i+1] = key;
        }
    }

    public static void print_Array(int M_array[]){
        int n = M_array.length;
        for(int i=0; i<n; i++){
            System.out.println(M_array[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements you want to sort: ");
        int length = scan.nextInt();
        int M_array[] = new int[length];
        System.out.println("Enter " +length+ " numbers you want to sort: ");
        for(int i = 0; i<M_array.length; i++){
            M_array[i] = scan.nextInt();
        }
        System.out.println("Entered Numbers:");
        print_Array(M_array);
        sort(M_array);
        System.out.println("Sorted Array:");
        print_Array(M_array);
    }
}