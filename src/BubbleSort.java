import java.util.ArrayList;

public class BubbleSort {
    public static int[] sort(int[] array) {
        int[] arr = array.clone();
        for (int i = arr.length; i > 0; i--) {
            boolean swapped = false;
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tempInt = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempInt;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> arrayList) {
        ArrayList<Integer> arr = (ArrayList<Integer>) arrayList.clone();
        for (int i = arr.size(); i > 0; i--) {
            boolean swapped = false;
            for (int j = 0; j < i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int tempInt = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, tempInt);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }
}
