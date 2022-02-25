// Sieve of Eratosthenes | primes from 2 to n
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // call the function
        System.out.println(sieveOfEratosthenes(50));
    }

    // create function to accept n and return dynamic array
    static ArrayList<Integer> sieveOfEratosthenes(int n){
        // create temporary array
        int[] arr = new int[n-1];

        // populate temp array with elements from 2 to n
        for (int p = 2; p <= n; p++) arr[p-2] = p;

        // for p to n while p * p <= n
        for(int p = 2; p * p <= n; p++){

            // if current arr element is not 0 (unchecked)
            if (arr[p-2] != 0){
                // loop to check for none primes and substitute them to 0
                for (int j = p; j * p <= n; j++){
                    arr[j*p-2] = 0;
                }
            }
        }

        /* create new dynamic array (you can use a static one by counting
            non-zero integers from the temp array) */
        ArrayList<Integer> arrL = new ArrayList<>();
        for (int p = 2; p <= n;p++){
            // copy each non-zero integer into the new array
            if (arr[p-2] != 0){
                arrL.add(arr[p-2]);
            }
        }
        return arrL;
    }
}
