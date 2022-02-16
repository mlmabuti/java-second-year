public class Main {
    public static void main(String[] args) {
        System.out.println(gcd(60,24));
        System.out.println(recursiveGcd(62, 12));
    }

    static int gcd(int m, int n){
        while (n != 0){
            int r = m % n;
            m = n;
            n = r;
        }
        return m;
    }

    static int recursiveGcd(int m, int n){
        if (n == 0){ return m; }
        return recursiveGcd(n, m % n);
    }
}
