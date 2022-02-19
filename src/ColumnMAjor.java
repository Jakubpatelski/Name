public class ColumnMAjor {
    public static void main(String[] args) {
        String[][] matrix = {{"[0][0]", "[0][1]", "[0][2]"},
                {"[1][0]", "[1][1]", "[1][2]"},
                {"[2][0]", "[2][1]", "[2][2]"},
                {"[3][0]", "[3][1]", "[3][2]"}};

        int stepCount = 0;

        for(int a = 0; a < matrix[0].length; a++) {
            for(int b = 0; b < matrix.length; b++) {
                System.out.print("Step: " + stepCount);
                System.out.print(", Element: " + matrix[b][a]);
                System.out.println();
                stepCount++;
            }
        }
    }


}
