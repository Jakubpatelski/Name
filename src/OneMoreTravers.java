public class OneMoreTravers {
    public static void main(String[] args) {
        int[][] intMatrix = {
                { 4,  6,  8, 10, 12, 14, 16},
                {18, 20, 22, 24, 26, 28, 30},
                {32, 34, 36, 38, 40, 42, 44},
                {46, 48, 50, 52, 54, 56, 58},
                {60, 62, 64, 66, 68, 70, 79}};

        for (int i = 0; i < intMatrix.length;i++){
            for (int j = 0; j < intMatrix[0].length;j++){
                System.out.print(intMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n");




        int[][] matm = {
                { 4,  6,  8, 10, 12, 14, 16},
                {18, 20, 22, 24, 26, 28, 30,30,50,60},
                {32, 34, 36, 38, 40, 42, 44},
                {46, 48, 50, 52, 54, 56, 58},
                {60, 62, 64, 66, 68, 70, 79}
        };

        // matm[i].length is better as it reads through all the rows not only the first one
        for (int i = 0; i < matm.length;i++){
            for (int b = 0; b < matm[i].length;b++){
                System.out.print(matm[i][b]  + "\t");
            }
            System.out.println();
        }


        int sum = 0;
        int x = 0;
        for(int i=0; i<intMatrix.length; i++) {
            for(int j = 0; j < intMatrix[i].length; j++) {
                // Insert a line of code to increase the variable `sum` by each accessed element
                sum+=intMatrix[i][j];
                x++;
            }
        }
        System.out.println(x);
        System.out.println(sum);


        String[][] wordData = {{"study", "consider", "examine", "learn"}, {"ponder", "read", "think", "cogitate"}};

        //Use nested enhanced for loops to calculate the total number of characters in the wordData 2D array and print the result to the console. (Get the string .length() of each element)
        int characterCount = 0;
        for(int i = 0; i < wordData.length;i++){
            for(int j = 0; i< wordData[i].length;j++){
                characterCount+=wordData.length;
            }
        }
        System.out.println(characterCount);
        for (String[] a : wordData){
            for (String b : a){
                characterCount+= b.length();
            }
        }
       // System.out.println(characterCount);

    }




}
