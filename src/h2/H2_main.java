package h2;

import java.util.Arrays;

public class H2_main {
    public static void main(String[] args) {
    }

    public static int[] change(int[] a, int[] b, int start, int end) {


        if (end > start) {
            if (Arrays.compare(a, b) != 0 ){

                int[] copyA = a.clone();
                return copyA;
            }
            if (Arrays.compare(a, b) == 0 ){
               int[] sortedA = a.clone();
                Arrays.sort(sortedA);


                int[] sortedB = Arrays.copyOfRange(sortedA, start, end );

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
