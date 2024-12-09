public class remainder {
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
    public static void main(String[] args) {
        
    }
}
