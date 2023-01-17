import java.util.List;
import java.util.Scanner;

public class Change_YHC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = Integer.parseInt(sc.nextLine());
        input = 1000 - input;

        System.out.println(Change_YHC.solution(input));
    }

    public static int solution(int money) {
        List<Integer> charges = List.of(500,100,50,10,5,1);
        int result = 0;

        for (int charge : charges) {
            result += money / charge;
            money %= charge;
        }
        return result;
    }
}
