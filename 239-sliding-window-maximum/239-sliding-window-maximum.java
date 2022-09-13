class Solution
{
public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 1 || k == 1) {
            return nums;
        }
        int[] result = new int[nums.length - k + 1];
        int max1 = nums[0];
        int in1 = 0;
        int in2 = 0;
        int max2 = nums[1];
        for (int i = 1; i < k; i++) {
            if (nums[i] >= max1) {
                in2 = in1;
                max2 = max1;
                in1 = i;
                max1 = nums[i];
            }
        }
        result[0] = max1;
        int end = k;
        int count = 1;
        while (end < nums.length) {
            if (nums[end] >= max1) {
                max2 = max1;
                in2 = in1;
                max1 = nums[end];
                in1 = end;
                end++;
                result[count++] = max1;

            } else {
                if (nums[end] >= max2) {
                    max2 = nums[end];
                    in2 = end;
                }

                if (in1 <= end - k || in2 <= end - k) {
                    max1 = nums[end - k + 1];

                    for (int i = end - k + 1; i <= end; i++) {
                        if (nums[i] >= max1) {
                            in2 = in1;
                            max2 = max1;
                            in1 = i;
                            max1 = nums[i];
                        }
                    }
                }
                end++;
                result[count++] = max1;
            }
        }
        return result;
    }
}