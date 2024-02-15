class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int cnt = 0;
        
        for(int i = 0; i<= (num_list.length/n)-1; i++) {
            for (int j = 0; j <= n-1; j++) {
                answer[i][j] = num_list[cnt];
                cnt++;
            }
        }
        return answer;
    }
}