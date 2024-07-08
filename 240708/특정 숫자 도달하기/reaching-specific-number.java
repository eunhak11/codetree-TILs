import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int avg, idx=0;
        int sum=0;
        for(int i=0; i<10; i++){
            int a=sc.nextInt();
            if(a<250) sum+=a;
            else break;
            idx=i+1;
        }
        System.out.printf("%d %.1f", sum, (float)sum/(float)idx);
    }
}