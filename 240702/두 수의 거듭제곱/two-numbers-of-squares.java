import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        res(a, b);
    }

    public static void res(int a, int b){
        int pr=1;
        for(int i=0; i<b; i++){
            pr*=a;
        }
        System.out.println(pr);
    }
}