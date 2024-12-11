public class booleanpallindrom {
    // public static boolean ispalli(int x){
    //     String s = Integer.toString(x);
    //     int n = s.length();
    //     for(int i = 0;i<n/2;i++){
    //         if(s.charAt(i) != s.charAt(n-i-1)){
    //             return false;
    //         }
    //     }
    //     return true;   
    // }
    public static boolean ispalli(int x){
        String s = Integer.toString(x);
        int n = s.length();
        for(int i = 0;i<n;i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int x = 12321;
        System.out.println(ispalli(x));
    }
}
