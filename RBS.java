public class RBS {
    public static void main(String[] args) {
        int[] nums={6,7,8,9,1,2,3,4,5};
        int target=0;
        System.out.println(search(nums,target));
    }
    static int search(int[] nums,int target){
    int pivot=findpivot(nums);
        if(pivot==-1){
        return BS(nums,target,0,nums.length-1);
    }
        if(target==nums[pivot]){
        return pivot;
    }
        if(target>=nums[0]){
        return BS(nums,target,0,pivot-1);
    }
        return BS(nums,target,pivot+1,nums.length-1);
}
    static int findpivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>0 && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[start]>nums[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
    static int BS(int[] nums,int target,int start,int end){
        while(end>=start){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
