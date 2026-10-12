class Solution {
    public int[] productExceptSelf(int[] nums) {
        var len = nums.length;
        var result = new int[len];
        var prefix = new int[len];
        var suffix = new int[len];

        prefix[0] = 1;
        suffix[len - 1] = 1;

        for (int i = 1; i < len; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        for (int i = len - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < len; i++) {
            result[i] = prefix[i] * suffix[i];
        }        

        return result;
    }
}
