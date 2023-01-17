package Programmers;

import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0, cnt = 0, tmp = 0;
        Arrays.sort(people);
        for(int i = people.length - 1; i >= tmp; i--) {
            if(people[i] + people[tmp] <= limit)
                tmp++;
            cnt++;
        }
        return answer;
    }
}