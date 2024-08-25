import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[2*n];
        for(int i=0; i<2*n; i++) arr[i]=sc.nextInt();
        Arrays.sort(arr);
        
        int max=0;
        for(int i=0; i<n; i++){
            int sum=arr[i]+arr[n*2-i-1];
            max = (sum>max) ? sum : max;
        }
        System.out.println(max);
    }
}