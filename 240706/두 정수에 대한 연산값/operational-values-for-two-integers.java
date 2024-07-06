import java.util.Scanner;
class IntWrapper{
    int val;
    public IntWrapper(int value){
        this.val = value;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntWrapper a = new IntWrapper(sc.nextInt());
        IntWrapper b = new IntWrapper(sc.nextInt());
        cal(a, b);
        System.out.printf("%d %d", a.val, b.val);  
    }
    public static void cal(IntWrapper a, IntWrapper b){
        IntWrapper max = (a.val > b.val) ? a : b;
        IntWrapper min = (a.val > b.val) ? b : a;
        max.val+=25;
        min.val*=2;
    }
}