import java.util.Arrays;

public class A2dtraver {
    public static void main(String[] args) {
        char[][] letterBlock = {{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j', 'k', 'l'}};
        System.out.println(Arrays.deepToString(letterBlock));
        System.out.println("\n");

        System.out.println(Arrays.toString(letterBlock[0]) + "\n");
        System.out.println(Arrays.toString(letterBlock[1]) + "\n");
        System.out.println(Arrays.toString(letterBlock[2]) + "\n");
        System.out.println(Arrays.toString(letterBlock[3]) + "\n");
        System.out.println("\n");

        for (char[] block : letterBlock){
            System.out.println(block);
        }
        System.out.println("\n");


        for (int i = 0; i < letterBlock.length;i++){
            System.out.println(Arrays.toString(letterBlock[i]));
        }


        int lengthOfOuterArray = letterBlock.length;
        System.out.println(lengthOfOuterArray);

        char[] subArray = letterBlock[0];
        System.out.println(subArray);
        int lengthOfSubArray = letterBlock[0].length;
        System.out.println(lengthOfSubArray);

        for(int a = 0; a < letterBlock.length; a++) {
            for(int b = 0; b < letterBlock[a].length; b++) {
                System.out.print("Accessed: " + letterBlock[a][b] + "\t");
            }
            System.out.println();
        }

    }
}
