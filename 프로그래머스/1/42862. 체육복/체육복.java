class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] status = new int[n];

        // 모두 1씩 초기화
        for(int i = 0; i < n ;i++)
            status[i] = 1;

        // lost 체크
        for(int l : lost){
            status[l-1]--;
        }

        // reserve 체크
        for(int r : reserve){
            status[r-1]++;
        }

        // 주변 사람 도와주기
        for(int i = 0; i < n; i++){
            // 만약 체육복이 없다면
            if(status[i] == 0){
                // 왼쪽 사람이 2개 가지고 있다면 하나 받기
                if(i-1 >= 0 && status[i-1] > 1){
                    status[i]++;
                    status[i-1]--;
                    continue;
                }
                // 오른쪽 사람이 2개 가지고 있다면 하나 받기
                if(i+1 < n && status[i+1] > 1){
                    status[i]++;
                    status[i+1]--;
                }
            }
        }

        // 1개 이상 체육복 가지고 있는 사람 카운트
        for(int i = 0; i < status.length; i++){
            if(status[i] > 0)
                answer++;
        }

        return answer;
    }
}