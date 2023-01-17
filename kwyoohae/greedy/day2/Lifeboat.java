import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int temp = 0;
        
        Arrays.sort(people);
        
        int right = people.length - 1;
        
        for(int left = 0; left <= right; right--) {
            if (people[left] + people[right] <= limit) {
                left++;
            }
            answer++;
        }
        
        return answer;
    }
}
