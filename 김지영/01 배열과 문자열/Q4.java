package array_and_string;

import java.util.Scanner;

/**
 * 1.4 회문 순열 (palindrome)
 * 회문: 앞으로 읽으나 뒤로 읽으나 같은 문자열
 * 순열: 문자열 재배치
 * 문자열을 재배치해서 회문이 되는 지 찾는 문제
 * tact coa
 * true (taco cat, atco cta)
 */
public class Q4 {

    // 문자열의 길이가 짝수면 모든 문자가 개수가 짝수여야한다.
    // 하지만 문자열의 길이가 홀수이면 홀수인 문자가 한개여야 함.
    public boolean solution(String pharse) {
        int[] table = buildCharFrequencyTable(pharse); // 각 문자 출현 횟수 저장 테이블
        return checkMaxOneodd(table);
    }

    // 홀수문자가 한개 이상인지 확인
    public boolean checkMaxOneodd(int[] table) {
        boolean foundOdd = false;
        for(int count : table) {
            if(count%2 == 1) {
                if(foundOdd) {
                    return false; // 홀수가 1개 이상인 경우 false 반환
                }
                foundOdd = true;
            }
        }
        return true; // 홀수가 하나도 발견 안되는 경우도 true

    }

    // 문자에 숫자 대응 (a=0, b=1, c=2,...)
    // Character.getNumericValue('a') = 10
    // Character.getNumericValue('A') = 10
    // 대소문자 구분 없고 문자 아닌경우 -1반환
    public int getCharNum(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val =Character.getNumericValue(c);
        if(a<=val && val>=z) {
            return val-a;
        }
        return -1;
    }

    // 각 문자가 몇번 등장했는지 카운트
    public int[] buildCharFrequencyTable(String pharse) {
        int[] table = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
        for(char c : pharse.toCharArray()) {
            int x = getCharNum(c);
            if(x != -1) {
                table[x]++;
            }
        }
        return table;
    }


    public static void main(String[] args) {
        Q4 T = new Q4();
        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
        String str = "tact coa";
        System.out.println(T.solution(str));
    }

}