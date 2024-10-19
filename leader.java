public class leader {
    public static void printLeaders(int[] arr) {
        int n = arr.length;
        int max = arr[n - 1];
        System.out.print(max + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.print(max + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        printLeaders(arr);
    }   
}
