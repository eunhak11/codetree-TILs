import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String target=sc.next();
        System.out.println(searchIndex(s, target));
    }

    public static int searchIndex(String s, String target){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==target.charAt(0)){
                String cmp=s.substring(i);
                if(cmp.length() >= target.length()) {
                    int cnt=0;
                    for(int j=0; j<target.length(); j++){ // 두 부분문자열 비교
                        if(cmp.charAt(j) != target.charAt(j)) break; // 하나라도 다르면 종료
                        cnt++;
                    }
                    if(cnt==target.length()) return i;
                }
            }
        }
        return -1;
    }
}