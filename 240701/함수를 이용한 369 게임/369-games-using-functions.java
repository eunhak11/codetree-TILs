import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int cnt=0;
        for(int i=a; i<b+1; i++){
            if(theNumber(i)) cnt++;
        }
        System.out.println(cnt);
    }

    public static boolean theNumber(int n){
        if(isTsn(n) || isMult(n)) return true;
        else return false;
    }
    public static boolean isTsn(int n){
        while(n!=0){
            if((n%10)%3==0){
                return true;
            } 
            else{
                n=n/10;
            }
        }
        return false;
    }
    public static boolean isMult(int n){
        if(n%3==0) return true;
        else return false;
    }
}