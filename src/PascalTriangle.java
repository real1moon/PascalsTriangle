import java.util.Scanner;

public class PascalTriangle {

    Scanner scanner;
    int rows,counter;
    int[][] pascalTriangle;

    public PascalTriangle() {

        scanner = new Scanner(System.in);
        System.out.print("Number of rows for Pascal's Triangle: ");
        rows = scanner.nextInt();
        scanner.close();

        System.out.println();
        pascalTriangle = new int[rows][rows];
        for(int i = 0; i < rows; i++) {
            counter = 0;
            for(int j = 0; j < i; j++) {
                if(j==0 || j==1)
                    pascalTriangle[i][j] = 1;
                else
                    pascalTriangle[i][j] = pascalTriangle[i - 1][j] + pascalTriangle[i - 1][j - 1];
                counter += pascalTriangle[i][j];
                System.out.print(pascalTriangle[i][j]+" ");
            }
            if(counter!=0)
                System.out.print("| " + counter);
            else
                System.out.print("Triangle | sum of row");
            System.out.println();
        }

    }


    public static void main(String[] args) {
        new PascalTriangle();
    }
}
