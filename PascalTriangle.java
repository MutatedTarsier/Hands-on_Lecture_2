import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    private int rows;
    private List<List<Integer>> triangles;

    public PascalTriangle(int rows){
        this.rows = rows;
        this.triangles = new ArrayList<>();       
    }

    public int createTriangle(){
        // Create first two rows
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        List<Integer> secondRow = new ArrayList<>();
        secondRow.add(1);
        secondRow.add(1);
        triangles.add(firstRow);
        triangles.add(secondRow);

        // Check if rows is only just 1 before calculating
        if (rows == 1){
            triangles.remove(1);
            return 1;
        }
        for (int i = 2; i < rows; i++){
            // Iterate rows
            List<Integer> prev_columns = triangles.get(i - 1);
            // Create a row
            List<Integer> new_row = new ArrayList<>();
            new_row.add(1);
            for (int j = 0; j < prev_columns.size() - 1; j++){
                // Add numbers to rows
                Integer leftNum = prev_columns.get(j);
                Integer rightNum = prev_columns.get(j + 1);
                Integer sum = leftNum + rightNum;
                new_row.add(sum);
            }
            // Add final 1
            new_row.add(1);
            triangles.add(new_row);
        }
        return 1;
    }

    public void display(){
        for (int row = 0; row < triangles.size(); row++){
            for (int column = 0; column < triangles.get(row).size(); column++){
                Integer number = triangles.get(row).get(column);
                System.out.print(number);
            }
            System.out.println();
        }
    }

}
