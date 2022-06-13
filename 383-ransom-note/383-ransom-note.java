class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {
		for(char i = 97; i < 123; i++) {
			int ransomNoteCnt = countChar(ransomNote, i);
			int magazineCnt = countChar(magazine, i);
			
			if(ransomNoteCnt > magazineCnt) {
				return false;
			}
		}
		
    	return true;
    }
	
	public static int countChar(String str, char ch) {
		return (int) str.chars().filter(c -> c == ch).count();
	}
}