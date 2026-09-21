package basic_programs;

public class BitwiseDemo {
    public static void main(String[] args) {
        int a = 5;  // Binary: 0101
        int b = 3;  // Binary: 0011

        System.out.println("--- Basic Bitwise Operators ---");
        System.out.println("a = " + a + " (Binary: 0101)");
        System.out.println("b = " + b + " (Binary: 0011)\n");

        // AND
        System.out.println("a & b (AND): " + (a & b)); // Expected: 1

        // OR
        System.out.println("a | b (OR): " + (a | b));  // Expected: 7

        // XOR
        System.out.println("a ^ b (XOR): " + (a ^ b)); // Expected: 6

        // NOT
        System.out.println("~a (NOT): " + (~a));       // Expected: -6

        System.out.println("\n--- Shift Operators ---");
        
        // Left Shift (Multiply by 2^1)
        System.out.println("a << 1 (Left Shift): " + (a << 1)); // Expected: 10

        // Right Shift (Divide by 2^1)
        System.out.println("a >> 1 (Right Shift): " + (a >> 1)); // Expected: 2
    }
}
