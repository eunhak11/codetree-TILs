import java.util.Scanner;

class IntWrapper {
    int val;

    public IntWrapper(int value){
        this.val = value;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            IntWrapper w = new IntWrapper(arr[i]);
            abs(w);
            arr[i] = w.val;
        }  

        for(int i=0; i<n; i++){
            System.out.printf("%d ", arr[i]);
        }

    }

    public static void abs(IntWrapper w){
        w.val = (w.val <0) ? w.val*(-1) : w.val;
    }
}