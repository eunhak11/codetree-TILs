import java.util.Scanner;
public class Main {
    public static int cnt=0;
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        cal(n);
        System.out.println(cnt);
    }

    public static void cal(int n){
        if(n==1) return;

        if(isEven(n)){
            cnt++;
            cal(n/2);
        }
        else{
            cnt++;
            cal(n/3);
        }
        
    }
    public static boolean isEven(int n){
        if(n%2==0) return true;
        else return false;
    }
}