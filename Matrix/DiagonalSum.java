class DiagonalSum {

    public static void diagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
                if (i + j == matrix.length - 1 && i != j) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void optimisedDGSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // pd
            sum += matrix[i][i];

            // sd
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        optimisedDGSum(matrix);

    }
}
