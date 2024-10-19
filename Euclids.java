import java.util.*;

public class Euclids{
    public static int gcd(int a,int b){ //a>b
        if(a == 0){
            return b;
        }else{
            return gcd(b%a,a);
        }
    }
    
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("the GCD of (a,b) : "+ gcd(a,b));

    }
}