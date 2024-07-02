import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int cnt=0;
        for(int i=a; i<b+1; i++){
            if(isPrime(i)){
                cnt+=i;
            }
        }
        System.out.println(cnt);
    }

    public static boolean isPrime(int n){
        int i=2;
        while(i<n){
            if(n%i==0) return false;
            else i++;
        }
        return true;
    }
}