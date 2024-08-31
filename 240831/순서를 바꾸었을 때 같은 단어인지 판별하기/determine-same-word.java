import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        char[] arr=a.toCharArray();
        char[] brr=b.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        sch(arr, brr);
    }

    public static void sch(char[] arr, char[] brr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] != brr[i]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}