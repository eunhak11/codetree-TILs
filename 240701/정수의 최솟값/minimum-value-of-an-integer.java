import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        prMin(a, b, c);
    }

    public static void prMin(int a, int b, int c){
        int min=0;
        if(a>b){
            min = (b>c) ? c : b;
        }
        else{
            min = (c<a) ? c : a;
        }
        System.out.println(min);
    }
}