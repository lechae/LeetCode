class Solution {
	    public static int[] kWeakestRows(int[][] mat, int k) {
            int[] result = new int[k];

            int[] idx = new int[mat.length];
            int[] arr = new int[mat.length];

            for(int i = 0; i < mat.length; i++) {
                idx[i] = i;
                arr[i] = 0;
                for(int j = 0; j < mat[i].length; j++) {
                    arr[i] += mat[i][j];       
                }
            }

            for(int i = 0; i < arr.length - 1; i++) {
                for(int j = i + 1; j < arr.length; j++) {
                    if(arr[i] > arr[j] || (arr[i] == arr[j] && idx[i] > idx[j])) {
                        int tmp = idx[i];
                        idx[i] = idx[j];
                        idx[j] = tmp;

                        tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }

            for(int i = 0; i < k; i++) {
                result[i] = idx[i];
            }

            return result;
        }
	}