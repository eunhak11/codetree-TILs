import java.util.Scanner;
class IntWrapper{
    int value;
    public IntWrapper(int value){
        this.value = value;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntWrapper a=new IntWrapper(sc.nextInt());
        IntWrapper b=new IntWrapper(sc.nextInt());
        cal(a, b);
        System.out.printf("%d %d", a.value, b.value);
    }

    public static void cal(IntWrapper a, IntWrapper b){
        if(a.value > b.value){
            a.value*= 2;
            b.value+=10;
        }
        else{
            a.value+=10;
            b.value*=2;
        }
    }
}