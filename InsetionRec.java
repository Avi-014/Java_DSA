import java.util.Arrays;

public class InsetionRec {
    public static void main(String[] args) {
       int [] arr = {3,0,5,77,4,11,9};
       Sort(arr,1,1);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int [] arr , int row,int col){
        if(row>arr.length-1) {
            return;
        }
        if (col>0 && arr[col-1] > arr[col]) {
            int temp = arr[col - 1];
            arr[col - 1] = arr[col];
            arr[col] = temp;
            col--;
            Sort(arr, row, col);
        } else {
            Sort(arr,row+1,row+1);
        }
    }
}
