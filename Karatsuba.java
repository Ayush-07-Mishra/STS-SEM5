import java.util.Scanner;

public class Karatsuba {

    // Method to perform Karatsuba multiplication
    public static int karatsuba(int x, int y) {
        // Base case: if either number is small enough, use normal multiplication
        if (x < 10 || y < 10) {
            return x * y;
        }

        // Calculate the size of the numbers
        int n = Math.max(String.valueOf(x).length(), String.valueOf(y).length());
        int m = n / 2;  // Split size

        // Split the numbers into high and low parts
        int a = x / (int) Math.pow(10, m);
        int b = x % (int) Math.pow(10, m);
        int c = y / (int) Math.pow(10, m);
        int d = y % (int) Math.pow(10, m);

        // Recursive calls for the three products
        int ac = karatsuba(a, c);
        int bd = karatsuba(b, d);
        int adbc = karatsuba(a + b, c + d) - ac - bd;

        // Return the result using the Karatsuba formula
        return (int) (ac * Math.pow(10, 2 * m) + adbc * Math.pow(10, m) + bd);
    }

    // Correct main method with String[] args
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("Karatsuba multiplication of " + a + " and " + b + " = " + karatsuba(a, b));
    }
}
