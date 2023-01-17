import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int point1 = 0;
        int point2 = people.length - 1;

        while (point1 <= point2) {
            if (people[point1] + people[point2] <= limit) {
                point1++;
            }
            point2--;
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{70, 50, 80, 50}, 100));  // 3
        System.out.println(solution.solution(new int[]{70, 80, 50}, 100));      // 3
    }
}
