import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] P = new int[N];

        for (int i = 0; i < N; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(P);

        int accumulate = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            accumulate += P[i];
            sum += accumulate;
        }

        bw.write(sum + "");
        bw.flush();
        bw.close();
    }
}
