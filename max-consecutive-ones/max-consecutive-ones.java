class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0, max = 0;
		
		for (int num : nums) {
			if(num == 1) {
				max++;
			} else {
				if(result < max) result = max;
				max = 0;
			}
		}
        if(result < max) result = max;
		
		return result;
    }
}