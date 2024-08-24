import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] brr=new int[n];

        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        for(int j=0; j<n; j++) brr[j]=sc.nextInt();
        Arrays.sort(arr);
        Arrays.sort(brr);

        for(int k=0; k<n; k++){
            if(arr[k]!=brr[k]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}