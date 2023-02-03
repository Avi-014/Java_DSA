public class OrderAgnosticsBS {
    public static void main(String[] args) {
        int[] arr = {0, 3, 7, 11, 16, 23, 24, 30, 36, 42};
        int[] nums = {42, 36, 30, 24, 23, 16, 11, 7, 3, 0};
        int target = 30;
        int ans = BS(arr, target);
        System.out.println(ans);
        System.out.println(BS(nums, target));
    }

    static int BS(int[] arr, int target) {
        int start = 5;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[0] < arr[arr.length - 1]) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {end = mid - 1;}
            }
            if (arr[0] > arr[arr.length - 1]) {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {end = mid - 1;}
            }
        }
        return -1;
    }
}