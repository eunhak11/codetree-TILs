import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        sumInt(N);
    }

    public static void sumInt(int n){
        int tot=0;
        for(int i=0; i<n+1; i++){
            tot+=i;
        }
        System.out.println(tot/10);
    }
}