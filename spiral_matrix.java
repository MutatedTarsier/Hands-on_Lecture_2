import java.util.ArrayList;
import java.util.List;

/* Problem:
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 * Constaints:
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 10
 * -100 <= matrix[i][j] <= 100
 */

// See test cases to see different inputs, their outputs, and the expected outputs
public class spiral_matrix {
    public static void main(String[] args){
        int[][] matrix = { // Input matrix
            {1, 2, 3, 4,},
            {14,15,16,5},
            {13,20,17,6},
            {12,19,18,7},
            {11,10,9,8},
        };
        List<Integer> spiral_matrix = get_order(matrix);
        display(spiral_matrix); // Print ordered matrix
    }   

    private static List<Integer> get_order(int[][] matrix){
        // Get dimensions of matrix
        int m = matrix.length;
        int n = matrix[0].length;

        // Initialize boundaries
        int top = 0;
        int bot = m-1;
        int left = 0;
        int right = n-1;

        List<Integer> new_matrix = new ArrayList<>(); // Ordered matrix for returning
        while (top <= bot && left <= right){
            // Travel right
            for (int i = left; i <= right; i++){
                new_matrix.add(matrix[top][i]);
            }
            top++; // Lower boundary for next pass-through
            // Travel down
            for (int i = top; i <= bot; i++){
                new_matrix.add(matrix[i][right]);
            }
            right--; // Lower boundary for next pass-through
            if (new_matrix.size() == n*m){
                break;
            }
            // Travel left
            for (int i = right; i >= left; i--){
                new_matrix.add(matrix[bot][i]);
            }
            bot--; // Lower boundary for next pass-through
            // Travel up
            for (int i = bot; i >= top; i--){
                new_matrix.add(matrix[i][left]);
            }
            left++; // Lower boundary for next pass-through
        }

        return new_matrix;
    }
    private static void display(List<Integer> ordered_matrix){
        // Displays pascal triangle without padding
        for (int i = 0; i < ordered_matrix.size(); i++){
            System.out.print(" " + ordered_matrix.get(i));
        }
    }
}
