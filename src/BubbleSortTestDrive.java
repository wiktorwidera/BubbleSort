import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSortTestDrive {
    public static void main(String[] args) {
        int[][] arrays = {
                {},
                {1,2,5,3,1,7,9,1,12,83,1,5,3,2},
                {1,1,1,1,1,1,1,2,1,1,1},
                {2,2,2,2},
                {1,2},
                {2,1}
        };

        for (int[] array : arrays) {
            System.out.println("In: " + Arrays.toString(array));
            System.out.println("Out: " + Arrays.toString(BubbleSort.sort(array)));
            System.out.println();
        }
        System.out.println("================");
        System.out.println("Overloaded BubbleSort method (ArrayList):");
        for (int[] array : arrays) {
            ArrayList<Integer> inArr = convertArrayToArrayList(array);
            System.out.println("In: " + inArr);
            System.out.println("Out: " + BubbleSort.sort(inArr));
            System.out.println();
        }
    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>(array.length);
        for (int element : array) {
            arrayList.add(element);
        }
        return arrayList;
    }
}
