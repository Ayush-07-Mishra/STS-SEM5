import java.util.*;
public class LeaderOfArray {
    public static void printLeaders(int arr[]){
        int n = arr.length;
        int max = arr[n-1];
        System.out.println(max);
        for(int i = n-2;i>=0;i--){
            if(arr[i]>max){
                max = arr[i];
                System.out.println(max);
            }
        }
    }

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        printLeaders(arr);
    }
}
