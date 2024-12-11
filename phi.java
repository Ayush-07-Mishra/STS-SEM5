import java.util.*;

public class phi {
    public static int EularPhi(int n){
        int result = n;
        for(int p = 2;p*p<=n;p++){
            if(n%p == 0){
                while(n%p == 0){
                    n = n/p;
                }
                result -= result/p;
            }
        }
        if(n>1){
            result -= result/n;
        }
        return result;
    }

    // public static void eularphi(int n){
    //     int result = n;
    //     for(int p = 2;p*p<=n;p++){
    //         if(n%p == 0){
    //             while(n%p == 0){
    //                 n = n/p;
    //             }
    //             result -= result/p;
    //         }
    //     }
    //     if(n>1){
    //         result -= result/n;
    //     }
    //     System.out.println(result);
    // }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(EularPhi(n));
    }
}