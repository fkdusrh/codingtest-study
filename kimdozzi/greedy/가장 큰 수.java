package Programmers;

import java.util.Arrays;

class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int mx;
        for(int i = 0; i < number.length() - k; i++) {
            mx = 0;
            for(int j = index; j <= k+i; j++) {
                if(mx < number.charAt(j)-'0') {
                    mx = number.charAt(j)-'0';
                    index = j+1;
                }

            }
            sb.append(mx);
        }
        return sb.toString();
    }
}