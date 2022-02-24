// Sieve of Eratosthenes
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 20;
        int[] arr = new int[n+1];
        for (int i = 2; i <= arr.length; i++) arr[i-2] = i;

        for (int p = 2; p * p <= n; p++) {
            if (arr[p] != 0)
            {
                for (int i = p * p; i <= n; i += p) arr[i] = 0;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
