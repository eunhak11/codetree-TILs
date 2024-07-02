import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        String b=sc.next();
        int c=sc.nextInt();

        switch(b){
            case "+": System.out.printf("%d + %d = %d", a, c, a+c);
                break;
            case "-": System.out.printf("%d - %d = %d", a, c, a-c);
                break;
            case "/": System.out.printf("%d / %d = %d", a, c, a/c);
                break;
            case "*": System.out.printf("%d * %d = %d", a, c, a*c);
                break;
            default: System.out.println("False");
        }

    }
}