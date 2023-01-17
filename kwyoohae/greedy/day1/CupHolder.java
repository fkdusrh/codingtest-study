import java.util.Scanner;

public class CupHolder_YHC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxPeople = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();

        System.out.println(CupHolder_YHC.solution(input, maxPeople));
    }

    public static int solution(String input, int maxPeople) {
        int result = 0;
        String addCupHolder = makeCupHolder(input);

        for (char ch : addCupHolder.toCharArray()) {
            if (ch == '*')
                result++;
        }
        return Math.min(result,maxPeople);
    }

    public static String makeCupHolder(String input) {
        String result = " ";
        for (int i = 0 ; i < input.length(); i++) {
            if (input.charAt(i) == 'S') {
                if(result.charAt(result.length() - 1) != '*') {
                    result += "*S*";
                } else {
                    result += "S*";
                }
            } else if (input.charAt(i) == 'L' && input.charAt(i + 1) == 'L') {
                if(result.charAt(result.length() - 1) != '*') {
                    result += "*LL*";
                } else {
                    result += "LL*";
                }
                i++;
            }
        }
        return result.trim();
    }
}
