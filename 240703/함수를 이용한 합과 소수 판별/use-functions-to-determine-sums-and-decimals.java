import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int cnt=0;
        for(int i=a; i<b+1; i++){
            if(isNum(i)) cnt++;
        }
        System.out.println(cnt);
    }

    public static boolean isNum(int n){
        if(isPrime(n) && evenSum(n)) return true;
        else return false;
    }
    public static boolean isPrime(int n){
        if(n==1) return false;

        for(int i=2; i<n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static boolean evenSum(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return (sum%2==0) ? true : false;
    }
}