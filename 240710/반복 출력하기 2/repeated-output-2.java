import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        prHW(n);
    }
    public static void prHW(int n){
        if(n==0) return;
        prHW(n-1);
        System.out.println("HelloWorld");
    }
}