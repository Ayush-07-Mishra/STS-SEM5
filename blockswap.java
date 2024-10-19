import java.util.Scanner;
public class blockswap {
    public static void reverseArray(int arr[],int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void swapblock(int arr[],int d,int n){
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,n-1);
        reverseArray(arr, 0, n-1);
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array : ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        d = d%n;
        swapblock(arr,d,n);
    }
}