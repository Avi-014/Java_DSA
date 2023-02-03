import java.util.ArrayList;

public class LinSearchRec {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,6,6,7};
        int target = 6;
        System.out.println(FindAllIndices(arr,target,0));
    }
    static ArrayList<Integer> FindAllIndices(int [] arr,int target,int index){
        ArrayList<Integer> List = new ArrayList<>();
        if (index==arr.length){
            return List;
        }
        if (target==arr[index]){
            List.add(index);
        }
        ArrayList<Integer> ans = FindAllIndices(arr,target,index+1);
        List.addAll(ans);
        return List;
    }
}
