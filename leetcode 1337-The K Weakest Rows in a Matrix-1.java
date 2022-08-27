import java.util.Arrays;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] rows = new int[mat.length][2];
        for (int i=0;i<mat.length;i++) {
            rows[i][0] = i;
            for (int j=0;j<mat[i].length;j++) {
                rows[i][1] += mat[i][j];
            }
        }
        Arrays.sort(rows, (a, b) -> a[1]-b[1]);
        int[] answer = new int[k];
        for (int i=0;i<k;i++) {
            answer[i] = rows[i][0];
        }
        
        return answer;
    }
}
