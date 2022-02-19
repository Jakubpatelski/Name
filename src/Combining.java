import java.util.Arrays;

public class Combining {
    public static void main(String[] args) {
        int[][] imageData={{100,90,255,80,70,255,60,50},
                {255,10,5,255,10,5,255,255},
                {255,255,255,0,255,255,255,75},
                {255,60,30,0,30,60,255,255}};

        int[][] newImage = new int[4][6];

        System.out.println(Arrays.deepToString(newImage));


//use nested for loops to copy over the data from the original image (stored in imageData) to the new image,
// make sure not to include the cropped out columns (right 2 columns).
        for(int i=0; i< newImage.length; i++){
            for(int j=0; j< newImage[i].length; j++){
                newImage[i][j] = imageData[i][j];
            }
        }
        System.out.println(Arrays.deepToString(newImage));


        for (int i = 0; i < newImage.length;i++){
            for (int j = 0; j < newImage[i].length;j++){
                if (newImage[i][j] - 50 < 0){
                    newImage[i][j] =0;
                } else {
                    newImage[i][j]-=50;
                }
            }

        }
        System.out.println(Arrays.deepToString(newImage));
        System.out.println("\n");

        for (int i = 0;i<newImage.length;i++){
            for (int j = 0; j < newImage[i].length;j++){
                System.out.print(newImage[i][j] + " ");
            }
            System.out.println();
        }
    }
}
