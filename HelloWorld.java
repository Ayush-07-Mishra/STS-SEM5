import java.util.*;
class HelloWorld {
    public static void Sive(int l,int n){
        
        boolean prime[] = new boolean[n+1];
        for(int i =2 ;i<n;i++){
            prime[i] = true;
        }
        
        for(int i = 2;i*i<n;i++){
            for(int j =i+1;j<n;j++){
                if(j%i == 0){
                    prime[j] = false;
                }
            }
        }
    
        for(int i =l;i<n;i++){
            if(prime[i] == true){
                System.out.print(i+" ");
            }
        }
    }
    
    public static int Cremender(int div[],int rem[],int size){
        int x = 1;
        
        while(true){
            boolean flag = true;
            for(int i =0;i<size;i++){
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
    
    public static void eularphi(int n){
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
        System.out.println(result);
    }
    
    
  public static boolean isstromo(String num) {
    Map<Character,Character>map = new HashMap<Character,Character>();
  map.put('6','9');
  map.put('1','1');
  map.put('0','0');
  map.put('8','8');
  map.put('9','6');
    
    int l =0;
    int r = num.length()-1;
    while(l<=r){
        if(!map.containsKey(num.charAt(l))){
            return false;
        }
        if(map.get(num.charAt(l)) != num.charAt(r)){
            return false;
        }
        l++;
        r--;
    }
    return true; 
}


// public static boolean isstromo(String n){
//     Map<Character,Character>map = new HashMap<Character,Character>();
//     map.put('6','9');
//     map.put('1','1');
//     map.put('0','0');
//     map.put('9','6');
//     map.put('8','8');
    
//     int l = 0;
//     int r = n.length()-1;
    
//     while(l<=r){
//         if(!map.containsKey(n.charAt(l))){
//             return false;
//         }
//         if(map.get(n.charAt(l)) != n.charAt(r)){
//             return false;
//         }
//         l++;
//         r--;
//     } 
//     return true;
// }


public static void Door(int n){
    
    boolean arr[] = new boolean[n+1];
    for(int i=1;i<=n;i++){
        for(int j = 1;i*j<n;j++){
            if(arr[j] == false){
                arr[j] = true;
            }else{
                arr[j] = false;
            }
        }
    }
    int a=0,b=0;
    for(int i =1;i<=n;i++){
         if(arr[i] == true){
            a++;
        }else{
            b++;
        }
    }
    
    System.out.println(a);
    System.out.println(b);
}


public static boolean isboolpalindrome(int n){
    String s = Integer.toBinaryString(n);
    int l = 0;
    int r = s.length()-1;
    
    while(l<=r){
        if(s.charAt(l) != s.charAt(r)){
            return false;
        }
        l++;
        r--;
    }
    
    return true;
}


    public static void main(String[] args) {
        // Sive(20);
        Sive(10,30);
        eularphi(50);
        if(isstromo("69")){
            System.out.println("stromo succ");
        }else{
            System.out.println("f");
        }
        
        Door(50);
        
        if(isboolpalindrome(20)){
            System.out.println("yes");
        }else{
            System.out.println("N0");
        }
    }
}