import java.util.Scanner;

public class swapTwoNIbbles {
    public static byte SwapByte(byte b){
        byte upperNibble = (byte)((b & 0xF0)>>4);
        byte lowNibble = (byte)((b & 0x0F));
        byte Swappedbyte = (byte)((lowNibble << 4) | upperNibble);
        return Swappedbyte;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        byte b = (byte)input;
        System.out.println("enter  ; ");
        byte Swap = SwapByte(b);
        System.out.println(Integer.toBinaryString(Swap & 0xFF));
    }
}
