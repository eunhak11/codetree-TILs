import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(ftr(n));
    }

    public static int ftr(int n){
        if(n==0) return 1;
        if(n==1) return 1;
        
        return ftr(n-1)*n;
    }
}