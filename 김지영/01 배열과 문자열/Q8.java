package array_and_string;

import java.util.ArrayList;

/**
 * 1.8 0 행렬
 * // 0이 있는 곳의 행, 열을 0으로 바꾸기
 * 0 3 3
 * 3 3 3
 * 3 3 3
 * 3 3 0
 *
 * 0 0 0
 * 0 3 0
 * 0 3 0
 * 0 0 0
 *
 */
public class Q8 {

    public void solution(int [][] matrix){

        // 0번째, 3번째 행에 0이 있음
        ArrayList<Integer> rows = new ArrayList();
        // 0번째, 2번째 열에 0이 있음
        ArrayList<Integer> cols = new ArrayList();
//        T.rowToZero(matrix,0);
//        T.rowToZero(matrix,3);
//        T.colToZero(matrix,0);
//        T.colToZero(matrix,2);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for (int i = 0; i < rows.size(); i++) {
            rowToZero(matrix, rows.get(i));
        }
        for (int i = 0; i < cols.size(); i++) {
            colToZero(matrix, cols.get(i));
        }
    }

    public void colToZero(int [][] matrix, int col){
        for (int row = 0; row < matrix.length; row++) {
            matrix[row][col] = 0;
        }
    }

    public void rowToZero(int [][] matrix, int row){
        for (int col = 0; col < matrix[0].length; col++) {
            matrix[row][col] = 0;
        }
    }

    public static void main(String[] args) {
        Q8 T = new Q8();
        int [][] matrix = {
            {0, 3, 3},
            {3, 3, 3},
            {3, 3, 3},
            {3, 3, 0},
        };

        T.solution(matrix);

        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}