public class flip {
    public static int flipZero(int arr[]){
        int n = arr.length;
        int maxlength = 0;
        int currentLength = 0;
        int previousLength = 0;
        boolean zero = false;

        for(int i=0;i<n;i++){
            if(arr[i] == 1){
                currentLength++;
            }else{
                maxlength = Math.max(maxlength,previousLength+currentLength+1);
                previousLength = currentLength;
                currentLength = 0;
                zero = true;
            }
        }
        return maxlength;
    }
    public static void main(String args[]){
        int arr[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1};
        flipZero(arr);
    }
}
