import java.util.Scanner;

public class metrix {
    public static void main(String[] args) {
        int n,m;
        int[][] A;
        int[][] B;
        int cnt=0;

        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        A=new int[n][m];
        B=new int[n][m];

        for(int i=0;i<n;i++){
            String s = sc.next();
            for(int j=0;j<m;j++){
                A[i][j]=Integer.parseInt(s.substring(j,j+1));
            }
        }
        for(int i=0;i<n;i++){
            String s = sc.next();
            for(int j=0;j<m;j++){
                B[i][j]=Integer.parseInt(s.substring(j,j+1));
            }
        }


        for(int i = 0 ; i < n-2; i++) {
            for(int j = 0 ; j < m-2; j++) {
                // i,j 가 다르다면 뒤집는다(이 지점은 다시뒤집을수 없는 지점이므로 무조건 뒤집음)
                if(A[i][j] != B[i][j]) {
                    for(int p = i ; p <i+3 ; p++) {
                        for(int q = j; q<j+3 ; q++) {
                            A[p][q] = A[p][q] ^ 1 ;
                        }
                    }
                    cnt++;
                }
            }
        }

        int tmp=0;
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                if(A[i][j] == B[i][j])
                    tmp ++;
            }
        }
        if(tmp == n*m)
            System.out.println(cnt);
        else
            System.out.println(-1);

    }
}
