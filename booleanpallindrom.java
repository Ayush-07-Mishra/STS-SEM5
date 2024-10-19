public class booleanpallindrom {
    public static boolean ispalli(int x){
        String s = Integer.toString(x);
        int n = s.length();
        for(int i = 0;i<n/2;i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        return false;   
    }
    public static void main(String[] args) {
        int x = 121;
        System.out.println(ispalli(x));
    }
}
