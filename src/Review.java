import java.util.Arrays;

public class Review {

        public static void main(String[] args) {

            //First, declare and initialize a 4x3 2D array of doubles called `scores` which will contain the exam data for four students. The rows will represent the student and the columns will represent the exam number. You already know the first exam scores (80.4, 96.2, 100.0, 78.9). Use initializer lists to store the first exam scores in the first column and -1 for the remaining exams. Use the provided print statement to print the result in the console.
            double[][] scores = {{80.4, -1,-1,},
                    {96.2, -1,-1,},
                    {100.0, -1,-1,},
                    {78.9, -1,-1,}
            };

            //(89.7, 90.5, 93.6, 88.1)
            scores[0][1] = 89.7;
            scores[1][1] = 90.5;
            scores[2][1] = 93.6;
            scores[3][1] = 88.1;



            System.out.println(Arrays.deepToString(scores));




            double[][] newScores = new double[4][2];

            for (int i =0; i< newScores.length;i++){
                for (int j =0; j < newScores[i].length;j++){

                          newScores[i][j] =scores[i][j];
                    }
                }
            System.out.println(Arrays.deepToString(newScores));



            for (int i =0; i< newScores.length;i++){
                for (int j =0; j < newScores[i].length;j++){
                    if (newScores[i][j] < 90){
                        newScores[i][j]+=2;
                    }
                }
            }



            System.out.println(Arrays.deepToString(newScores));



        }
    }

