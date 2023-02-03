import java.util.Arrays;

public class SelSortRec {
    public static void main(String[] args) {
        int [] arr = {12,45,78,5,4,20};
        Sort(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int[] arr,int row , int col,int max){
        if (row==0){
            return;
        }
        if (row>col) {
            if (arr[col] > arr[max]) {
                Sort(arr, row, col + 1, col);
            }
            else {
                Sort(arr, row, col+1, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[row];
            arr[row] = temp;
            Sort(arr, row-1, 0, 0);
        }
    }
}
