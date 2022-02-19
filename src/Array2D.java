import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        float[][] floatTwoD;
         floatTwoD = new float[4][10];
         int[][] dataChart = new int[15][8];
         char[][] ticTacToe = {{'X', 'O', 'O'}, {'O','X', ' '}, {'X', ' ', 'O'}};

        int[][] ticTac= {{1,2,3}, {1,2,3}, {1,2,3}};
        for (int[] tic : ticTac){
            System.out.println(tic);
        }

        // System.out.println(ticTacToe);

        System.out.println("\n");
        for (char[] tic : ticTacToe){
            System.out.println(tic);
        }
        System.out.println("\n");

        int[] nums = {0,1,10,5};

        int checkNum = nums[2];
        System.out.println(checkNum);

        char check = ticTacToe[0][2];
        System.out.println("CHecking: " + check);

        System.out.println(nums[3]);


        ticTacToe = new char[][] {{'O', 'X', 'X'}, {'X', 'O', ' '}, {'O', ' ', 'O'}};

        for (char[] tic : ticTacToe){
            System.out.println(tic);
        }

        int[][] intMatrix = {
                {1, 1, 1, 1, 1},
                {2, 4, 6, 8, 0},
                {9, 8, 7, 6, 5}
        };

        int get = intMatrix[1][2];
        System.out.println(5* get);
        System.out.println(intMatrix[1][2]*3);

        intMatrix[1][2] = 150;
        System.out.println(intMatrix[1][2]);
        System.out.println(intMatrix[1][2]*3);

        System.out.println(Arrays.deepToString(intMatrix));


        int[][] ingMatrix = {
                {1, 1, 1, 1, 1},
                {2, 4, 6, 8, 0},
                {9, 8, 7, 6, 5}
        };

        int[][] subMatrix = new int [2][2];
        ingMatrix[1][1] =0;
        System.out.println(Arrays.deepToString(intMatrix));

        // Using 4 lines of code, multiply each of the elements in the 2x2 top left corner of intMatrix by 5 and store the results in the subMatrix you created. Afterwards, uncomment the provided print statement below.
        subMatrix[0][0] = ingMatrix[0][0] * 5;
        subMatrix[0][1] = ingMatrix[0][1] * 5;
        subMatrix[1][0] = ingMatrix[1][0] * 5;
        subMatrix[1][1] = ingMatrix[1][1] * 5;

        System.out.println(Arrays.deepToString(subMatrix));
    }
}
