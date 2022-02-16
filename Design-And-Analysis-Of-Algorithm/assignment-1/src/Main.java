public class Main {
    public static void main(String[] args) {
        int[] sortedArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(linearSearch(11, sortedArr));
        System.out.println(linearSearch(8, sortedArr));

        System.out.println(binarySearch(0, sortedArr));
        System.out.println(binarySearch(10, sortedArr));
    }

    static int linearSearch(int n, int[] arr){
        for ( int i : arr ) if (i == n) return i;
        return -1;
    }

    static int binarySearch(int n, int[] arr){
        int left = 0, right = arr.length-1;

        while (left <= right){
            int mid = (left+right)/2;

            if (arr[mid] == n) return arr[mid];
            else if (arr[mid] < n) left = mid+1;
            else if (arr[mid] > n) right = mid-1;
        } return -1;
    }
}

