package array_and_string;

import java.util.Scanner;

/**
 * 1.1 중복이 없는가
 * 문자열에 같은 문자가 중복되어 등장하는 지 확인
 */
public class Q1 {
    public boolean solution (String str) {
        // ASCII 코드라 가정 1byte -> 2의8승,
        // 1비트는 값 표현에 쓰이지 않으므로 2의7승 최대 128개의 문자열이 들어온다.
        if (str.length() > 128) return false;
        boolean[] charSet = new boolean[128];

        for (int i=0; i<str.length(); i++) {
            int val = str.charAt(i);
            if (charSet[val]) {
                return false;
            }
            charSet[val] = true;
        }

        return true;
    }
    public static void main(String[] args) {
        Q1 T = new Q1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}