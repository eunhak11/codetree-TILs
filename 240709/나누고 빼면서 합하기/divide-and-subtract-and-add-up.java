import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0; i<n; i++){ // array compositon
            arr[i]= sc.nextInt();
        }

        int sum=0;
        while(m!=0){
            sum+=arr[m-1];
            m = (m%2==0) ? m/2 : m-1;
        }
        System.out.println(sum);
    }
}