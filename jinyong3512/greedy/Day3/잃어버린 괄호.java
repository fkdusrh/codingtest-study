import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        int tmp_input_index = 0;
        Stack<String> stack = new Stack<>();
        int answer = 0;

        for (int input_index = 0; input_index < input.length(); input_index++) {

            if (input.charAt(input_index) == '+' || input.charAt(input_index) == '-') {

                if (!stack.isEmpty() && stack.peek().equals("+")) {
                    stack.pop();
                    stack.push(
                            Integer.toString(
                                    Integer.parseInt(stack.pop())
                                            + Integer.parseInt(input.substring(tmp_input_index, input_index))
                            )
                    );
                } else {
                    stack.push(input.substring(tmp_input_index, input_index));
                }

                stack.push(String.valueOf(input.charAt(input_index)));
                tmp_input_index = input_index + 1;

            }
        }

        if (!stack.isEmpty() && stack.peek().equals("+")) {
            stack.pop();
            stack.push(
                    Integer.toString(
                            Integer.parseInt(stack.pop())
                                    + Integer.parseInt(input.substring(tmp_input_index))
                    )
            );
        } else {
            stack.push(input.substring(tmp_input_index));
        }

        while (stack.size() != 1) {
            if (stack.peek().equals("-")) {
                stack.pop();
            } else {
                answer -= Integer.parseInt(stack.pop());
            }
        }

        answer += Integer.parseInt(stack.pop());

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}
