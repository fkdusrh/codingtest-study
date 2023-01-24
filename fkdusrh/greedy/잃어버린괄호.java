
import java.util.Scanner;
public class lossbracket {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Str=sc.nextLine();

        Str+='=';
        int n=0,tmp=0;
        int minus = 0;

        for(int i=0;i<Str.length();i++){
            char c = Str.charAt(i);

            if(c>='0' && c<='9'){//숫자
                tmp = tmp*10+(c-'0');
            }
            else{//부호
                if(minus==1){
                    n-=tmp;
                }
                else{
                    n+=tmp;
                    if(c=='-'){
                        minus=1;
                    }
                }
                tmp=0;
            }
        }

        System.out.println(n);
    }
}
