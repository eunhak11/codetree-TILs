import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        if(isPdr(a)) System.out.println("Yes");
        else System.out.println("No");
    }
    public static boolean isPdr(String s){
        int ln = s.length();
        for(int i=0; i<ln/1; i++){
            if((s.charAt(i))!=s.charAt(ln-i-1)) return false;
        }
        return true;
    }
}