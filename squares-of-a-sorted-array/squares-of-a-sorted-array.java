class Solution {
    public int[] sortedSquares(int[] nums) {
        int idx = 0;
		while(idx < nums.length) {
			nums[idx] = nums[idx] * nums[idx];
			idx++;
		}
		
		for(int i = 0; i < nums.length-1; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] > nums[j]) {
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
		}
		
		return nums;
    }
}