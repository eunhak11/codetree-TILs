import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(cal(n));
    }

    public static int cal(int n){
        int a=n/10;
        int b=n%10;
        if(a==0) return b*b;
        return cal(a)+b*b;
    }
}