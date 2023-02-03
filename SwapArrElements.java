import java.util.Arrays;
import java.util.Scanner;

public class SwapArrElements {
        public static void main(String[] args) {
            System.out.print("Enter the size of array: ");
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int[] arr = new int[a];
            System.out.print("Enter the array elements : ");
            for (int i = 0; i < a; i++) {
                arr[i] = in.nextInt();
            }
            System.out.print("Array elements area as follows : ");
            for (int i = 0; i < a; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.print("Enter the two indices to swap : ");
            swap(arr);
            System.out.println("Swapped array : " + Arrays.toString(arr));
        }

        static void swap(int[] arr) {
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            int y = in.nextInt();
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
    }
