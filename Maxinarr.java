import java.util.Scanner;

public class Maxinarr {
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] arr = new int[a];
        System.out.print("Enter the array elements : ");
        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("created Array is : ");
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Max of no.s of the array is : "+max(arr));

    }
    static int max(int [] arr) {
        int Max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>arr[0]) {
                Max = arr[i];
            }
        }
        return Max;
    }
}
