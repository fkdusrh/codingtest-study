import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = 0;
        while (true) {
            number++;

            String string_input = br.readLine();
            int L = Integer.parseInt(string_input.split(" ")[0]);
            int P = Integer.parseInt(string_input.split(" ")[1]);
            int V = Integer.parseInt(string_input.split(" ")[2]);

            if (L == 0 && P == 0 && V == 0)
                break;

            int answer = V / P * L;
            if (V % P < L)
                answer += V % P;
            else
                answer += L;

            System.out.printf("Case %d: %d\n", number, answer);
        }

    }
}
