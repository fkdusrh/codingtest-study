public class Camping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 1;

        while (true) {
            String[] input = sc.nextLine().split(" ");
            if (input[0].equals("0") && input[1].equals("0") && input[2].equals("0") )
                break;
            int result = Camping.solution(Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2]));
            System.out.println("Case " + index++ + ": " + result);
        }
    }

    public static int solution(int L, int P, int V) {
        int result = 0;
        result = (V / P) * L;
        result += Math.min(V % P, L);
        return result;
    }
}
