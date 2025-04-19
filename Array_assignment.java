public class Array_assignment {
    public static boolean Q1(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int Q2(int numbers[], int target) {
        // This is O(n)
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int Q2Binary_search(int numbers[], int target) {
        // Here I have to implement the solution in O(log n ) time complexity
        return -1;
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 1 };
        int nums2[] = { 1, 2, 3, 4 };

        System.out.println(Q1(nums1));
        System.out.println(Q1(nums2));

        int Q2[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        System.out.println(Q2(Q2, target));

    }
}
