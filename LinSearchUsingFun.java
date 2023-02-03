import java.util.Scanner;

public class LinSearchUsingFun {
    public static void main(String[] args) {
        int[] arr = {23, 65, 37, 98, 03};
        Scanner in=new Scanner(System.in);
        System.out.print("Enter element to search ");
        int a = in.nextInt();
        System.out.print("Found at index "+LS(arr,a));
    }
    static int LS(int[] arr,int target){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
                return -1;
    }
}
