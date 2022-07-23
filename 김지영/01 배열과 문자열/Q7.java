package array_and_string;

/**
 * 1.7 행렬회전
 * 1 2 3 4
 * 5 6 7 8
 * 9 1 2 3
 * 4 5 6 7
 * // 대각선을 기준으로 swap
 * 1 5 9 4
 * 2 6 1 5
 * 3 7 2 6
 * 4 8 3 7
 * // 가운데 세로선을 기준으로 swap
 * 4 9 5 1
 * 5 1 6 2
 * 6 2 7 3
 * 7 3 8 4
 *
 */
public class Q7 {

    public void rotate90(int [][] matrix){
        int len = matrix.length;
        int temp = 0;

        // 대각선을 기준으로 swap
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0, k = len-1; j <len/2 ; j++, k--) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Q7 T = new Q7();
        int [][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 1, 2, 3},
            {4, 5, 6, 7}
        };

        T.rotate90(matrix);

        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}