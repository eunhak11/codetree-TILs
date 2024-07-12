import java.util.Scanner;
public class Main {
    public static int[] arr = new int[100];
    public static int max=0;
    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        int n=sc.nextInt();
        System.out.println(fMax(n));
    }
    public static int fMax(int n){
        if(n==1) return max;

        arr[n-1]=sc.nextInt();
        max = (max>arr[n-1]) ? max : arr[n-1];
        return fMax(n-1);
    }
}