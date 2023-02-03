public class SplitArrLargestSum {
    public static void main(String[] args) {
        int[] nums={7,2,5,10,8,23,46,11,90,345};
        System.out.println(splitArray(nums,5));
    }
    static int splitArray(int[] nums, int k) {
        int largestsum=0;
        int start=0;
        int end=nums.length-1;
        while(k>0){
            int sum=0;
            int mid=(start+(end-start)/k);
            for(int i=start;i<=mid;i++){
                sum=sum+nums[i];
            }
        if(sum>largestsum) {
            largestsum = sum;
        }
            start=mid+1;
            k--;
        }
        return largestsum;
    }
}
