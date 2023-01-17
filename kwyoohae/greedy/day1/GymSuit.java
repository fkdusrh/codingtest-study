class GymSuit_YHC {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n + 2];

        for (int i = 0; i < lost.length; i++) {
            student[lost[i]] -= 1;
        }

        for (int i = 0 ; i < reserve.length; i++) {
            student[reserve[i]] += 1;
        }

        for (int i = 1 ; i <= n ; i++) {
            if (student[i] == 1) {
                if (student[i-1] == -1) {
                    student[i] -= 1;
                    student[i-1] += 1;
                }
                else if (student[i+1] == -1) {
                    student[i] -= 1;
                    student[i+1] += 1;
                }
            }
        }

        for (int i = 1 ; i <= n ; i++) {
            if (student[i] >= 0)
                answer++;
        }

        return answer;
    }
}
