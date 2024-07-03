import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a; i<b+1; i++){
            if(isOn(i)) cnt++;
        }
        System.out.println(cnt);
    }

    public static boolean isOn(int n){
        if(n%2==0) return false;
        if(n%10==5) return false;
        if(n%3==0 && n%9!=0) return false;
        return true;
    }
}