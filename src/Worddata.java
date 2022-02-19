import java.util.Arrays;

public class Worddata {
    public static void main(String[] args) {
        String[][] wordData = {{"study", "consider", "examine", "learn"}, {"ponder", "read", "think", "cogitate"}};

        //Use nested enhanced for loops to calculate the total number of characters in the wordData 2D array and print the result to the console. (Get the string .length() of each element)
        int characterCount = 0;

        for (String[] wordRow : wordData) {
            for (String word: wordRow) {
                characterCount += word.length();
            }
        }

        System.out.println(characterCount);


        int x = 0;
        System.out.println(x);


        for (String[] letters : wordData){
            for (String word : letters){
                x+= word.length();
            }
        }
        System.out.println(x);

        int i = 0, j = 0;


        while (i < wordData.length) {
            j = 0;
            while (j < wordData[i].length) {
                System.out.println(wordData[i][j] + ": [" + i + "]" + "[" + j + "]");
                j++;
            }
            i++;
        }
        double[][] data = {{0.51,0.99,0.12},
                {0.28,0.99,0.89},
                {0.05,0.94,0.05},
                {0.32,0.22,0.61},
                {1.00,0.95,0.09},
                {0.67,0.22,0.17}};

        double sum = 0;
        for (double[] nums : data){
            for (double check: nums){

                System.out.print(sum + "\n");
            }
        }
        System.out.println(sum);


        double sumix = 0;
        double rowSum = 0.0;
        for (int d =0; d < data.length;d++){
            //variables declared here save only the last passed data so you cannot sum here it should be global variable for summing and oder caluclating.
            rowSum = 0.0;
            sumix = 0.0;
            for (int y = 0; y < data[d].length;y++){
                rowSum+=data[d][y];
                sumix+=data[d][y];
            }
            System.out.println("Row: " + d +", Sum: " + rowSum);
        }
        System.out.println(sumix);



    }

}
