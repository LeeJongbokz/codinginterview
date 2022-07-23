package array_and_string;

import java.util.Scanner;

/**
 * 1.6 문자열 압축
 *
 * aabcccccaaa -> a2b1c5a3
 * abcdefg -> abcdefg
 *
 */
public class Q6 {

    public String solution(String str){
        StringBuilder result = new StringBuilder();
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            cnt++;

            // 현재 값이랑 다음 값이 다르면 cnt 추가
            if(str.length() <= i+1 || str.charAt(i) != str.charAt(i+1)){
                result.append(str.charAt(i));
                result.append(cnt);
                cnt = 0;
            }
        }

        // abcdefg 경우 a1b1c1d1e1f1g1 가 아니라 abcdefg리턴
        if(result.length() < str.length()){
            return result.toString();
        } else {
            return str;
        }
    }

    public static void main(String[] args) {
        Q6 T = new Q6();
        Scanner sc = new Scanner(System.in);
//        String str= sc.next();
        System.out.println(T.solution("aabcccccaaa"));
        System.out.println(T.solution("abcdefg"));
    }

}