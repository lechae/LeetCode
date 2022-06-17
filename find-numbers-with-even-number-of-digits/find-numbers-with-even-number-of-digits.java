class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
		
		for(int num : nums) {
			int tmp = num;
			int digits = 0;
			do {
				digits++;
				tmp /= 10;
			} while(tmp != 0);
			
			if(digits%2 == 0) result++;
		}
		
		return result;
    }
}