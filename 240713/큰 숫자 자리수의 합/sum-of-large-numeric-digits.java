import java.util.Scanner;
public class Main {
    public static int res=0;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=1;
        for(int i=0; i<3; i++) num*=sc.nextInt();

        System.out.println(sumF(num));
    }

    public static int sumF(int num){
        if(num/10==0) {
            res+=num%10;
            return res;
        }
        res+=num%10;
        return sumF(num/10);
    }
}