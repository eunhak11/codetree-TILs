import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt(); 
        } 

        int[] sum=new int[m];
        for(int i=0; i<m; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int s=0;
            for(int j=a-1; j<b; j++) s+=arr[j];
            sum[i]=s;
        } 
        for(int i=0; i<m; i++){
            System.out.println(sum[i]);
        }
    }
}