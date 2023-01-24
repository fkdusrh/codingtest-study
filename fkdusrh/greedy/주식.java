import java.util.Scanner;
//주식
public class stock {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);

        n=sc.nextInt();

        for(int i=0;i<n;i++){
            //배열 크기 입력
            int size=sc.nextInt();
            long[] arr = new long[size];
            for(int j=0;j<size;j++){
                arr[j]=sc.nextInt();
            }
            //뒤에서 부터
            long max=0,sum=0;
            for(int j=arr.length-1;j>=0;j--){
                if(max<arr[j]){
                    max=arr[j];
                }
                else{
                    long plus=max-arr[j];
                    sum+=plus;
                }
            }
            System.out.println(sum);
        }

        /*for(int print:sumArr){
            System.out.println(print);
        }*/
    }
}
