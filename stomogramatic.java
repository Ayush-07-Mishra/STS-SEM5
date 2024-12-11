import java.util.*;

public class stomogramatic {
    public static boolean stromo(String s){
        Map<Character,Character>map = new HashMap<Character,Character>();
        map.put('6','9');
        map.put('9','6');
        map.put('0','0');
        map.put('1','1');
        map.put('8','8');

        int l = 0;
        int r = s.length() - 1;
        while(l<=r){
            if(!map.containsKey(s.charAt(l))){
                return false;
            }
            if(map.get(s.charAt(l)) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(stromo(s)){
            System.out.println("it is an Stomogramatic number : "+s);
        }else{
            System.out.println("it is not stomogramatic : " + s);
        }
    }
}