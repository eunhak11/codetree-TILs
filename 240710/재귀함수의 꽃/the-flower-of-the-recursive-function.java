import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        prNum(n);
    }

    public static void prNum(int n){
        if(n==0) return;
        System.out.printf("%d ", n);
        prNum(n-1);
        System.out.printf("%d ", n);
    }
}