import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(rec(n));
    }
    public static int rec(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        
        return rec(n/3)+rec(n-1);
    }
}