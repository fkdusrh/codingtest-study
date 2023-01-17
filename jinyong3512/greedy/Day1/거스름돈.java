import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input_MoneyToPay = Integer.parseInt(br.readLine());
        int change = 1000 - input_MoneyToPay;
        int answer = 0;

        answer += change / 500;
        change %= 500;

        answer += change / 100;
        change %= 100;

        answer += change / 50;
        change %= 50;

        answer += change / 10;
        change %= 10;

        answer += change / 5;
        change %= 5;

        answer += change / 1;

        bw.write(answer + "");

        bw.flush();
        bw.close();
    }
}
