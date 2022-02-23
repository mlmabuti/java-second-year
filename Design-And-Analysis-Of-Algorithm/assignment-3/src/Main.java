import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n = 20;
        ArrayList <Integer> arr = new ArrayList<>();
        for (int p = 2 ; p <= n; p ++ ){
            arr.add(p);
            if (arr.get(p) != 0){
                int j = p;
                while (j <= n){
                    arr.set(j, 0);
                    j = j + p;
                }
            }
        }

        System.out.println(arr.toString());
    }
}
