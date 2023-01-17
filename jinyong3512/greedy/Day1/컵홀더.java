import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int seat_number = Integer.parseInt(br.readLine());

        String seat_type = br.readLine();

        int count_L_number = (seat_type.length()
                - seat_type.replace("LL", "").length()) / 2;

        int answer;

        if (count_L_number <= 1)
            answer = seat_type.length();
        else
            answer = seat_type.length() - (count_L_number - 1);

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}
