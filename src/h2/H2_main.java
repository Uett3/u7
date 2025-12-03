package h2;

import java.util.Arrays;

public class H2_main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(change(new int[] {2, 7, 1, 9}, new int[] {5, 6, 7}, 2, 4)));
        System.out.println(Arrays.toString(change(new int[] {2, 7, 1, 9}, new int[] {2, 7, 1, 9}, 2, 4)));
        System.out.println(Arrays.toString(change(new int[] {2, 7, 1, 9}, new int[] {5, 6, 7}, 3, 2)));
    }

    public static int[] change(int[] a, int[] b, int start, int end) {


        if (end > start) {
            if (Arrays.compare(a, b) != 0 ){

                int[] copyA = a.clone();
                return copyA;
            }
            if (Arrays.compare(a, b) == 0 ){

                Arrays.sort(a);


                int[] sortedB = Arrays.copyOfRange(a, start, end );

                return sortedB;
            }
        }
        if (end <= start){
            int[] empty = new int[0];
            return empty;
        }

        return a;
    }
}
