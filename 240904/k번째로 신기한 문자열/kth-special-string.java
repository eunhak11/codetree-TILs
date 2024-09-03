import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String t=sc.next();
        String[] arr =new String[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.next();
        }
        fn(arr, t, k);
    }

    public static void fn(String[] arr, String t, int k){
        String[] brr=new String[arr.length];
        int idx=0;
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            String subs=arr[i].substring(0,t.length());
            if (subs.equals(t)){
                brr[idx]=arr[i];
                idx++;
            }
        }

        System.out.println(brr[k-1]);
    }
}