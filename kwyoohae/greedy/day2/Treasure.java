import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Treasure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = Integer.parseInt(sc.nextLine());

        List<Integer> A = new ArrayList<>();
        for (int i = 0 ; i < length; i++) {
            A.add(sc.nextInt());
        }

        List<Integer> B = new ArrayList<>();
        for (int i = 0 ; i < length; i++) {
            B.add(sc.nextInt());
        }

        System.out.println(Treasure.solution(length, A, B));
    }

    public static int solution(int length, List<Integer> A, List<Integer> B) {
        int result = 0;
        Collections.sort(A);

        for (int i = 0 ; i < length; i++) {
            int max = Collections.max(B);
            result += max * A.get(i);
            B.remove(B.indexOf(max));
        }

        return result;
    }
}
