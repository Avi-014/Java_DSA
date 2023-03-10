public class FindpivotINRBS {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9};
        System.out.println(nums[findpivot(nums)]);
    }
        static int findpivot ( int[] nums){
            int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (mid<end && nums[mid] > nums[mid + 1]) {
                    return mid;
                }
                if (mid>start && nums[mid] < nums[mid - 1]) {
                    return mid - 1;
                }
                if (nums[start] >= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }
    }