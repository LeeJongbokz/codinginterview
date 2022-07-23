package array_and_string;

import java.util.Scanner;

/**
 * 1.3 URLify
 * 문자열의 공백을 '%20'으로 바꾸는 메서드 작성
 */
public class Q3 {
    public String solution (String str, int strLength) {
        return str.replace(" ", "%20");
    }

    // 배열 크기를 늘리고 역순으로 공백 비교후 문자 채워넣기
    public String solution2 (String str, int strLength) {
        int spaceCnt = 0;
        for (int i = 0; i <strLength; i++) {
            if(str.charAt(i)==' '){
                spaceCnt++;
            }
        }

        int resultLength = strLength + spaceCnt * 2;
        char[] result = new char[resultLength];
        int index = resultLength;
        for (int i = strLength-1; i>=0; i--) {
            index--;
            if(str.charAt(i)==' '){
                result[index] = '0';
                result[index-1] = '2';
                result[index-2] = '%';
                index = index-2;
            }else {
                result[index] = str.charAt(i);
            }
        }

        return new String(result);
    }

    public static void main(String[] args) {
        Q3 T = new Q3();
        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
        String str = "Mr john smith";
        int strLength = 13;

        System.out.println(T.solution2(str, strLength));
    }

}