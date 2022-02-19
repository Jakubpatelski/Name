import java.util.Arrays;

public class Alst2DArrray {
    public static void main(String[] args) {
        double[][] doubleValues = {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8,  8.7, 7.6}, {3.6, 5.7, 7.8}};
        //retrieve elements
        System.out.println(doubleValues[0][2]); // prints 3.7

        //change element value
         doubleValues[0][2] = 5.5;

        System.out.println(doubleValues[0][2]);//prints 5.5

        //printing 2D array
        System.out.println(Arrays.deepToString(doubleValues));

        //traversing through 2D array

        //Row-major order

        for (int i = 0; i < doubleValues.length;i++){
            for (int j = 0; j < doubleValues[i].length;j++){
                //i use print!! instead of println as it prints each element next to each other println print below
                System.out.print(doubleValues[i][j] + " ");
            }
            // it makes a space after every row
            System.out.println();
        }
        System.out.println("\n");

        //Column-major order traverse

        for (int i = 0; i < doubleValues[i].length;i++){
            for (int j = 0; j < doubleValues.length;j++){
                System.out.print(doubleValues[j][i]+ " ");
            }
            System.out.println();
        }

        String[][] words = {{"championship", "QUANTITY", "month"},{"EMPLOYEE", "queen", "understanding"},{"method", "writer", "MOVIE"}};

        System.out.println("Before...");
        System.out.println(Arrays.deepToString(words).replace("],", "],\n") + "\n");

        for(int i=0; i<words.length; i++) {
            for(int j = 0; j<words[i].length; j++) {
                if(words[i][j]!=null) {

                    // Check the capitalization
                    boolean allCaps = true;

                    for(char c : words[i][j].toCharArray())
                        if(!Character.isUpperCase(c))
                            allCaps = false;

                    // Flip the capitalization
                    if(allCaps)
                        words[i][j] = words[i][j].toLowerCase();
                    else
                        words[i][j] = words[i][j].toUpperCase();
                }
            }
        }

        System.out.println("After...");
        System.out.println(Arrays.deepToString(words).replace("],", "],\n") + "\n");
    }
}
