import java.util.Scanner;

public class Matrix {
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.print(i + "," + j);
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void largestElement(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                largest = Math.max(largest, matrix[i][j]);
            }
        }
        System.out.println("largest element in the matrix is : " + largest);
    }

    public static void smallestElement(int matrix[][]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                smallest = Math.min(smallest, matrix[i][j]);
            }
        }
        System.out.println("Smallest element in the matrix is :" + smallest);
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        // Taking Input of 2d array
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Printing of 2d array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
                ;
            }
            System.out.println();
        }

        // search in 2d array2
        search(matrix, 5);

        largestElement(matrix);
        smallestElement(matrix);
    }
}
