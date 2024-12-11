import java.util.*;
public class CaineseRemender {
    public static int CR(int div[],int rem[],int n){
        int x = 1;
        
        while(true){
            boolean flag = true;
            for(int i = 0;i<n;i++){
                if(x%div[i] != rem[i]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return x;
            }
            x++;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of div and rem");
        int div[] = new int[n];
        int rem[] = new int[n];
        for(int i = 0;i<n;i++){
            div[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            rem[i] = sc.nextInt();
        }
        int x = CR(div,rem,n);
        System.out.println(x);
    }
}
