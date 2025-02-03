import java.util.ArrayList;
import java.util.List;

public class pascal_triangle {
    public static void main(String[] args){
        int rows = 10; // Edit to change amount of rows
        List<List<Integer>> pascal_triangle = get_triangle(rows);

        display(pascal_triangle); // Prints pascal triangle
    }
    private static List<List<Integer>> get_triangle(int numRows){
        // Initialize triangle
        List<List<Integer>> triangles = new ArrayList<>();

        // Create first two rows, starting with {1} and {1,1}
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        List<Integer> secondRow = new ArrayList<>();
        secondRow.add(1);
        secondRow.add(1);
        triangles.add(firstRow);
        triangles.add(secondRow);

        // Check if rows is only just 1 before calculating
        if (numRows == 1){
            triangles.remove(1);
            return triangles;
        }
        // If rows is 2, loop is skipped already
        for (int i = 2; i < numRows; i++){
            // Create empty row
            List<Integer> new_row = new ArrayList<>();
            new_row.add(1);
            // Get the values from previous row
            List<Integer> prev_columns = triangles.get(i - 1);
            for (int j = 0; j < prev_columns.size() - 1; j++){
                // Add numbers from previous row to current row
                Integer leftNum = prev_columns.get(j);
                Integer rightNum = prev_columns.get(j + 1);
                Integer sum = leftNum + rightNum;
                new_row.add(sum);
            }
            // Add final 1 to edge and add to pascal triangle
            new_row.add(1);
            triangles.add(new_row);
        }
        return triangles;
    }

    private static void display(List<List<Integer>> triangle){
        // Displays pascal triangle without padding
        for (int row = 0; row < triangle.size(); row++){
            for (int column = 0; column < triangle.get(row).size(); column++){
                Integer number = triangle.get(row).get(column);
                System.out.print(Integer.toString(number) + " ");
            }
            System.out.println();
        }
    }
    
}
