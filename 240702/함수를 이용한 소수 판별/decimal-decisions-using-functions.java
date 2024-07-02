import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=0;
        for(int i=a; i<b+1; i++){
            if(isPrime(i)){
                res+=i;
            }
        }
        System.out.println(res);
    }

    public static boolean isPrime(int n){
        int i=2;
        if(n==1) return false;
        while(i<n){
            if(n%i==0) return false;
            else i++;
        }
        return true;
    }
}