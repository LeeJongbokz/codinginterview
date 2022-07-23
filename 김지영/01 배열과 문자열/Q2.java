package array_and_string;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1.2 순열 확인
 * 문자열 두개가 주어졌을 때 이 둘이 순열 관계(두문자를 정렬했을때 같은 관계)인지 확인
 */
public class Q2 {

    public String sort(String s){
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public boolean solution (String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }

        return sort(str1).equals(sort(str2));
    }

    // 두문자 출현 횟수가 같은 지 확인
    public boolean solution2 (String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }

        int[] letters = new int[128];

        char[] s_arr = str1.toCharArray();
        for(char c : s_arr){
            letters[c]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            letters[c]--;
            if(letters[c]<0){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        Q2 T = new Q2();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(T.solution2(str1, str2));
    }
}