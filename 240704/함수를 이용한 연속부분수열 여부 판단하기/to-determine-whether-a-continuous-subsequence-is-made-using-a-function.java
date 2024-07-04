import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int[] arr = new int[n1];
        int[] brr = new int[n2];
        for(int i=0; i<arr.length; i++) arr[i]=sc.nextInt();
        for(int j=0; j<brr.length; j++) brr[j]=sc.nextInt();

        if(isSub(arr, brr)) System.out.println("Yes");
        else System.out.println("No");
    }
    public static boolean isSub(int[] arr, int[] brr){
        if(arr.length < brr.length) return false;

        else if(arr.length == brr.length){ // arr, brr 길이 동일
            for(int i=0; i<arr.length; i++){
                if(arr[i] != brr[i]) return false; // 하나라도 다르면 false
            }
            return true; // 모두 같은경우
        }

        else{ // arr이 brr보다 긴 경우
            int idc=0;
            for(int i=0; i<arr.length; i++){ // 틀린 조건 거르는 for문
                if(arr[i] == brr[0]){
                    if(brr.length > (arr.length- i+1)){ // brr길이가 남은 배열보다 긴 경우
                        return false;
                    }
                    else{
                        for(int j=0; j<brr.length; j++){
                            if(arr[i+j]!=brr[j]){ // 하나라도 다른 경우 false
                                return false;
                            }
                        }
                        idc++;
                    }
                    if(idc>0) return true;
                }
            }
        }
    }
}