import java.util.Arrays;

public class FindArray {

    public static int findIndex(int[] array, int t){
        if (array == null){
            return -1;
        }

        for (int i = 0; i < array.length;i++){
            if (array[i] == t){
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] someArr = {1,2,4,7,77,12};
        int[] x = new int[5];

        System.out.println(findIndex(someArr,12));
        System.out.println(findIndex(someArr,22));
        System.out.println(findIndex(x,1));
        leel();

    }

    public static void leel(){
        int[] nums = new int[10];
        nums[0] = 5;
        nums[1] = 5;
        nums[2] = 5;
        for (int x : nums){
            System.out.println(x);
        }
        System.out.println(Arrays.toString(nums));



    }
}
