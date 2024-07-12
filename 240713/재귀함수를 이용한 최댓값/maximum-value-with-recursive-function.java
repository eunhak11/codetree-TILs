import java.util.Scanner;
public class Main {
    public static int[] arr = new int[101];
    public static int max=0;
    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        int n=sc.nextInt();
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        max=arr[1];
        System.out.println(fMax(n));
    }
    public static int fMax(int n){
        max = (max>arr[n]) ? max : arr[n];
        if(n==1) return max;
        return fMax(n-1);
    }
}