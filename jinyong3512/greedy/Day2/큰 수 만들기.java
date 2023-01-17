class Solution {
    public String solution(String number, int k) {
        String answer = "";

        int pick_chance = number.length() - k;

        int last_pick_index = -1;

        while (pick_chance > 0) {
            char max_value = '0' - 1;
            int max_index = -1;

            for (int number_index = last_pick_index + 1; number_index < number.length() - pick_chance + 1; number_index++) {
                if (number.charAt(number_index) > max_value) {
                    max_value = number.charAt(number_index);
                    max_index = number_index;
                    if(max_value == '9')
                        break;
                }
            }

            answer += max_value;
            last_pick_index = max_index;
            pick_chance--;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("1924", 2));                 //      94
        System.out.println(sol.solution("1231234", 3));              //     3234
        System.out.println(sol.solution("4177252841", 4));          //    775841
    }
}
