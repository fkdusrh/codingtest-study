import java.util.PriorityQueue;
import java.util.Scanner;

public class cardSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i=n;i>0;i--){
            q.add(sc.nextInt());
        }

        int sum = 0;

        while(q.size()>1){
            int num=q.poll()+q.poll();
            sum+=num;
            q.add(num);
        }
        System.out.println(sum);

    }
}

