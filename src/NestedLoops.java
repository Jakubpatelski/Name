public class NestedLoops {
    public static void main(String[] args) {

        int weeks = 3;
        int days = 7;
        int i = 1;

        // outer loop
        while (i <= weeks) {
            System.out.println("Week: " + i);

            // inner loop
            for (int j = 1; j <= days; ++j) {
                System.out.println("  Days: " + j);
            }
            ++i;
        }
        System.out.println("\n");
        print();
        System.out.println("\n");
        anotherPrint();
        System.out.println("\n");
        printinggg();
        System.out.println("\n");
        pp();
        System.out.println("\n");
        p();




    }

    public static void print() {
        int weeks = 3;
        int days = 7;

        for (int i = 1; i <= weeks; ++i) {
            System.out.println("Week: " + i);

            // inner loop prints days
            for (int j = 1; j <= days; ++j) {
                System.out.println("  Day: " + j);
            }
        }
    }

    public static void anotherPrint(){
        int rows = 5;

        // outer loop
        for (int i = 1; i <= rows; i++) {

            // inner loop to print the numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public static void printinggg(){
        int weeks = 3;
        int days = 7;

        // outer loop
        for(int i = 1; i <= weeks; ++i) {
            System.out.println("Week: " + i);

            // inner loop
            for(int j = 1; j <= days; ++j) {

                // break inside the inner loop
                if(i == 2) {
                    break;
                }
                System.out.println("  Days: " + j);
            }
        }
    }

    public static void pp(){
        int outerCounter = 0;
        int[] innerArray = {1,2,3,4,5};

        while(outerCounter<7){
            System.out.println();
            for(int number : innerArray){
                System.out.print(number * outerCounter + " ");
            }
            outerCounter++;
        }
    }
    public static void p(){
       // int outerCounter = 0;
        int[] innerArray = {1,2,3,4,5};
        for (int i = 0; i < innerArray.length;i++) {
            for (int number : innerArray) {
                System.out.print(number * i + " ");
            }
            System.out.println();
        }

    }

}
