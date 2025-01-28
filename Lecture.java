import java.util.Scanner;
import java.util.List;
// Scanner input stuff

class Lecture {
    public static void main (String[] args){
        pFour(5);
    }
    static private char pOne_alt(){
        // My way of doing the problem (inefficient but fun to do)
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        scanner.close();
        char[] grade_letters = {'A', 'B', 'C', 'D', 'F'};
        for (int temp_grade = 90; temp_grade >= 60; temp_grade -= 10){
            int index = (90 - temp_grade) / 10;
            if (grade >= temp_grade){
                return grade_letters[index];
            }
        }
        return 'F';
    }
    static private char pOne(){
        // Using switch to convert grade number to letter
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        scanner.close();
        switch (grade/10){
            case 10:     
            case 9:
                return 'A';
            case 8:
                return 'B';
            case 7:
                return 'C';
            case 6:
                return 'D';
            default:
                return 'F';
        }
    }
    static private double pTwo(){
        // Tax Filings
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your status? ");
        int status = scanner.nextInt();
        System.out.print("\nWhat is your income? ");
        double income = scanner.nextDouble();
        scanner.close();

        double tax = 0.0;
        if (status == 0){ // Single
            // Not enough time, but I would just put more if statements
        } else if (status == 1){ // 
        } else if (status == 2){
        } else if (status == 3){
            
        }
        return 0;
    }

    static private void pThree(){
        // Multiplication Table
        // Nested for loop to create multiplication table
    }

    static private void pFour(int rows){
        // Pascal's triangle
        PascalTriangle triangle = new PascalTriangle(rows);
        triangle.createTriangle();
        triangle.display();
    }
}
