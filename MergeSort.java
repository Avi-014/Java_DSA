import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {4,5,3,2,1,0};
        mergesort(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int [] arr, int start ,int mid, int end) {
        int[] mix = new int[arr.length];
        int i = start;
        int j = mid + 1;
        int k = start;
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        if (i > mid) {
            while (j <= end) {
                mix[k] = arr[j];
                j++;
                k++;
            }
        } else {
            while (i <= mid) {
                mix[k] = arr[i];
                i++;
                k++;
            }
        }
        for (i=start;i<=end;i++){
            arr[i]= mix[i];
        }
    }
    static void mergesort(int [] arr,int start,int end){
        if (start<end){
            int mid = start + (end - start) / 2;
            mergesort(arr,start,mid);
            mergesort(arr,mid+1,end);
            Sort(arr,start,mid,end);
        }
    }
}
