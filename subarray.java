public class subarray {
    public static void subArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k] + " ");
                }
                System.out.println();

            }
        }
    }
    // Prefix sum
    public static int maxSumOfSubarrayPrefixSum(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        for (int start = 0; start < nums.length; start++) {
            int currSum = 0;
            for (int end = start; end < nums.length; end++) {
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    // Brute Force approach
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += nums[k];
                }
                if (max < currSum) {
                    max = currSum;
                }
            }
        }
        return max;
    }

    // Kadeans Algorithm
    public static int maxSumOfSubarrayKadensAlgo(int nums[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < nums.length; i++) {
            cs = cs + nums[i];
            ms = Math.max(cs, ms);
            if (cs < 0) {
                cs = 0;
            }
        }
        return ms;
    }

    public static void main(String[] args) {
        int nums[] = { -2, -3, 4, 1, 5, 6, -2 };
        // subArray(nums);
        // System.out.println(maxSubArray(nums));
        // System.out.println(isNegative(nums));
        System.out.println(maxSumOfSubarrayKadensAlgo(nums));
    }
}
