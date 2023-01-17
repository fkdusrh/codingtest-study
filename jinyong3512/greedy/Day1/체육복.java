import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        ArrayList<Integer> lost2 = new ArrayList<>();
        ArrayList<Integer> reserve2 = new ArrayList<>();
        ArrayList<Integer> overlap = new ArrayList<>();

        for (int reserve_value : reserve) {
            for (int lost_value : lost) {
                if (reserve_value == lost_value)
                    overlap.add(lost_value);
            }
        }
        for (int lost_value : lost) {
            if (!overlap.contains(lost_value)) {
                lost2.add(lost_value);
            }
        }
        for (int reserve_value : reserve) {
            if (!overlap.contains(reserve_value)) {
                reserve2.add(reserve_value);
            }
        }

        Collections.sort(lost2);
        Collections.sort(reserve2);

        answer = n - lost2.size();
        boolean[] lost_person_borrow = new boolean[lost2.size()];

        for (int reserve2_index = 0; reserve2_index < reserve2.size(); reserve2_index++) {
            for (int lost2_index = 0; lost2_index < lost2.size(); lost2_index++) {
                if (!lost_person_borrow[lost2_index]) {
                    if (reserve2.get(reserve2_index) - 1 == lost2.get(lost2_index) ||
                            reserve2.get(reserve2_index) + 1 == lost2.get(lost2_index)) {
                        answer++;
                        lost_person_borrow[lost2_index] = true;
                        break;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
        System.out.println(solution.solution(5, new int[]{2, 4}, new int[]{3}));
        System.out.println(solution.solution(3, new int[]{3}, new int[]{1}));
        System.out.println(solution.solution(3, new int[]{1, 2, 3}, new int[]{3}));
        System.out.println(solution.solution(5, new int[]{1, 2, 3, 4}, new int[]{3, 4, 5}));
        System.out.println(solution.solution(5, new int[]{2, 3, 4}, new int[]{1, 2}));
        System.out.println(solution.solution(7, new int[]{4, 2, 6}, new int[]{3, 5, 7}));
    }
}
