import java.util.Scanner;
public class Main {
    public static int[] arr = new int[100];
    public static int max=0;
    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        int n=sc.nextInt();
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        max=arr[0];
        System.out.println(fMax(n));
    }
    public static int fMax(int n){
        if(n==1) return max;
        max = (max>arr[n-1]) ? max : arr[n-1];
        return fMax(n-1);
    }
}