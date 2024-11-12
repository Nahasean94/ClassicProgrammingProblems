package binary_search;

public class Binary_Search {
    //Look up if a number is in an array
    public static boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return true;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 101;
        System.out.println(search(nums, target));

        boolean [] values={false,false,false,false,true,true,true};
        boolean targetBoolean=true;
        System.out.println(conditionSearch(values, targetBoolean));
    }

    //Look up the first index that contains the value
    public static int conditionSearch(boolean[] data, boolean target) {
        int left = 0;
        int right = data.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (data[mid] == target) {
                right  = mid ;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

}
