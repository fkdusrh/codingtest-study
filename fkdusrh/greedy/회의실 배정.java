import java.util.*;


public class meetingRoom {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[][] arr = new int[n][2];

        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1])
                    return o1[0] - o2[0];

                return o1[1] - o2[1];
            }
        });

        int cnt=0;
        int before=0;
        for(int i = 0; i < n; i++) {
            if(before <= arr[i][0]) { // 시작시간이 이전의 종료시간과 같거나 크다면 배정 가능
                before = arr[i][1]; // 이전의 종료시간 갱신
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
