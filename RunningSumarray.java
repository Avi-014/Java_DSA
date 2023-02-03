import java.util.Arrays;

public class RunningSumarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7,8,9,10};
        System.out.println(Arrays.toString(sum(arr)));
    }
    static int[] sum(int[] arr ){
//        int[] runningSum = new int[arr.length];
//        runningSum[0] = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            int j = i;
//            runningSum[j] = runningSum[i - 1] + arr[i];
            for (int i = 1; i < arr.length; i++) {
                arr[i] = arr[i - 1] + arr[i];
            }
//        return runningSum;
        return arr;
    }
}