// Sieve of Eratosthenes | primes from 2 to n
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 20;
        int[] arr = new int[n-1];
        for (int p = 2; p <= n; p++) arr[p-2] = p;

        for(int p = 2; p * p < n; p++){
            if (arr[p-2] != 0){
                for (int j = p; j * p < n; j++){
                    arr[j*p-2] = 0;
                }
            }
        }

        ArrayList<Integer> arrL = new ArrayList<>();
        for (int p = 2; p <= n;p++){
            if (arr[p-2] != 0){
                arrL.add(arr[p-2]);
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arrL);
    }
}


