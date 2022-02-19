public class Introduction {
    int[][] intMatrix = {
            { 4,  6,  8, 10, 12, 14, 16},
            {18, 20, 22, 24, 26, 28, 30},
            {32, 34, 36, 38, 40, 42, 44},
            {46, 48, 50, 52, 54, 56, 58},
            {60, 62, 64, 66, 68, 70, 79}
    };

    int numSubArrays = intMatrix.length;
    int numOutArrays = intMatrix[0].length;

    public  void getIt(int[][] array,int a, int b){
        for (int i = 0; i< a ; i++){
            for (int j = 0; j < b; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Introduction introduction = new Introduction();
        System.out.println(introduction.numSubArrays);
        System.out.println(introduction.numOutArrays);
        System.out.println("");
        introduction.getIt(introduction.intMatrix, introduction.numSubArrays,introduction.numOutArrays);

    }
}
