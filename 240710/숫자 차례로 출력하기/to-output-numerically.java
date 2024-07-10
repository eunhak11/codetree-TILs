import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        prUp(n);
        System.out.println();
        prDown(n);
    }
    public static void prUp(int n){
        if(n==0) return;
        prUp(n-1);
        System.out.printf("%d ",n);
    }
    public static void prDown(int n){
        if(n==0) return;
        prDown(n-1);
        System.out.printf("%d ", 8-n);
    }
}