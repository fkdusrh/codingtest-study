import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long result =0;

        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int left = 0;
        int right = n-1;

        for (; left < right ; left+=2) {
            if(arr[left] <1 && arr[left+1] < 1){
                result += arr[left] * arr[left+1];
            }else{
                break;
            }
        }

        for (; right >0; right-=2) {
            if(arr[right] >1 && arr[right-1] > 1){
                result += arr[right] * arr[right-1];
            }else{
                break;
            }
        }

        for (; right >= left; right--) {
            result += arr[right];
        }
        System.out.println(result);

    }
}
