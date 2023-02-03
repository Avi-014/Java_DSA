import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] arr={   {23,43,20},
                        {98,30,76,90},
                        {33,10}
                    };
        int target=in.nextInt();
        System.out.println("Found at index " +Arrays.toString(Search(arr,target)));

    }
    static int[] Search(int[][] arr,int target){
        for (int i=0;i<arr.length;i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}