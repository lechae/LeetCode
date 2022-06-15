class Solution {
    public int romanToInt(String s) {
        int idx = 0, result = 0;
		
		while(idx < s.length()) {
			int idxTmp, idxTmp2;
			
			switch (s.charAt(idx)) {
			case 'M': // 1000
				result += 1000;
				idx++;
				break;
			case 'D': // 500
				result += 500;
				idxTmp = idx + 1;
				while(s.substring(idxTmp).indexOf('C') == 0) {
					result += 100;
					idxTmp++;
				}
				idx = idxTmp;
				break;
			case 'C': // 100
				idxTmp = s.substring(idx).lastIndexOf('M');
				idxTmp2 = s.substring(idx).lastIndexOf('D');
				if(idxTmp == -1 && idxTmp2 == -1) {
					result += 100;
					idx++;
				} else if(idxTmp > 0) {
					result += 900;
					idx += 2;
				} else if(idxTmp2 > 0) {
					result += 400;
					idx += 2;
				}
				break;
			case 'L': // 50
				result += 50;
				idxTmp = idx + 1;
				while(s.substring(idxTmp).indexOf('X') == 0) {
					result += 10;
					idxTmp++;
				}
				idx = idxTmp;
				break;
			case 'X': // 10
				idxTmp = s.substring(idx).lastIndexOf('C');
				idxTmp2 = s.substring(idx).lastIndexOf('L');
				if(idxTmp == -1 && idxTmp2 == -1) {
					result += 10;
					idx++;
				} else if(idxTmp > 0) {
					result += 90;
					idx += 2;
				} else if(idxTmp2 > 0) {
					result += 40;
					idx += 2;
				}
				break;
			case 'V': // 5
				result += 5;
				idxTmp = idx + 1;
				while(s.substring(idxTmp).indexOf('I') == 0) {
					result += 1;
					idxTmp++;
				}
				idx = idxTmp;
				break;
			case 'I': // 1
				idxTmp = s.substring(idx).lastIndexOf('X');
				idxTmp2 = s.substring(idx).lastIndexOf('V');
				if(idxTmp == -1 && idxTmp2 == -1) {
					result += 1;
					idx++;
				} else if(idxTmp > 0) {
					result += 9;
					idx += 2;
				} else if(idxTmp2 > 0) {
					result += 4;
					idx += 2;
				}
				break;
			default:
				break;
			}
		}
		
    	return result;
    }
}