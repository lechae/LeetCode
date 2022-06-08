class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
		
		int cnt = 0;
		
		while(++cnt <= n) {
			if(cnt % 15 == 0) {
				result.add("FizzBuzz");
			} else if(cnt % 3 == 0) {
				result.add("Fizz");
			} else if(cnt % 5 == 0) {
				result.add("Buzz");
			} else {
				result.add(Integer.toString(cnt));
			}
		}
		
		return result;
    }
}