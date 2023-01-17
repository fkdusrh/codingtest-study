import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class ATM {
    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String test = "123456789";
        String[] split = test.split("");
        Arrays.sort(split, Collections.reverseOrder());
        for (String temp : split) {
            System.out.print(temp + " ");
        }
    }

    public static int solution(int maxPeople, List<Integer> people) {
        int result = 0;
        Collections.sort(people);

        for (int i = 0; i < maxPeople; i++) {
            for (int j = 0; j <= i ; j++) {
                result += people.get(j);
            }
        }

        return result;
    }
}
