import java.util.*;

class SieveOfEratosthenes {
    ArrayList<Integer> sieveOfEratosthenes(int n) {
        boolean[] arr = make_array(n);
        //only need to check up to the sqrt
        for (int i = 0 ; i < Math.sqrt(arr.length) ; i++) {
            if (arr[i] == true) {
                for (int j = (int) Math.round(Math.pow(i, 2)) ; j < arr.length ; j = j + i) {
                    arr[j] = false;
                }
            }
        }
        return findTrueIndices(arr);
    }
    private boolean[] make_array(int n) {
        boolean[] arr = new boolean[n+1];
        for (int i = 0 ; i < arr.length ; i++) {
            //premark all even
            if (i%2 == 0 & i != 2) {
                arr[i] = false;
            } else {
                arr[i] = true;
            }
        }
        arr[0] = false;
        arr[1] = false;
        return arr;
    } 

    private ArrayList<Integer> findTrueIndices(boolean[] arr) {
        // create `result` ArrayList
        ArrayList<Integer> result = new ArrayList<Integer>();
         
        // use for-loop to add index of `arr` elements to `result` that are `true` by calling `add()` method
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] == true) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 7;
        SieveOfEratosthenes g = new SieveOfEratosthenes();
        g.sieveOfEratosthenes(n);
        System.out.println(Arrays.toString(g.sieveOfEratosthenes(n).toArray()));
        // should return [2, 3, 5, 7]
    }
}