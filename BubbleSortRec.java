import java.util.Arrays;

public class BubbleSortRec {
    public static void main(String[] args) {
        int [] arr = {14,3,66,1,0,66,3,8};
        Bubbble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubbble(int[] arr,int row,int col){
        if (row==0){
            return;
        }
        if (col<row){
            if (arr[col]>arr[col+1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            Bubbble(arr,row,col+1);
        }
        else{
            Bubbble(arr,row-1,0);
        }
    }
}
