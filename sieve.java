import java.util.Scanner;

public class sieve {
    public static void isprime(int l,int n){
        boolean prime[] = new boolean[n+1];
        for(int i = 2;i<n;i++){
            prime[i] = true;
        }
        for(int i = 2;i*i<n ;i++){
            for(int j = i+1;j<n;j++){
                if(j%i == 0){
                    prime[j] = false;
                }
            }
        }
        for(int i = l;i<n;i++){
            if(prime[i] == true){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of l and n");
        int n = sc.nextInt();
        int l = sc.nextInt();
        isprime(n,l);
    }
}
