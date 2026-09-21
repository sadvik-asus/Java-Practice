// ==========================================
// TASK 1 & TASK 2: Structure & Annotations
// ==========================================

/**
 * [Documentation Section]
 * Program Name: ComprehensiveJavaBasics
 * Description: Demonstrates Java file structure, primitive datatypes,
 * constants, identifier rules, and built-in library classes.
 */

// [Package Section]
package LMS_Tasks;

// [Import Section]
import java.time.LocalDate;
import java.util.Scanner;

// [Class Section]
public class Assignment3 {

    // ==========================================
    // TASK 4: Declare constants using final
    // ==========================================
    public static final double PI = 3.14159;
    public static final int MAX_SIZE = 100;
    public static final int MIN_AGE = 18;

    // [main method Section]
    public static void main(String[] args) {

        // [Statement Section / Task 2 requirement]
        System.out.println("=== Task 2: Standard Output ===");
        System.out.println("Hello, Java Environment Initialized!\n");

        // Optional Scanner usage to satisfy import utility
        Scanner scanner = new Scanner(System.in);

        // ==========================================
        // TASK 3: All 8 Primitive Datatypes
        // ==========================================
        System.out.println("=== Task 3: Primitive Data Types ===");

        byte b = 120;
        short s = 32000;
        int i = 2147483640;
        long l = 9223372036854775800L; // Suffix 'L' required for 64-bit long literals
        float f = 3.14159f;            // Suffix 'f' required for 32-bit float literals
        double d = 2.718281828459045;
        char c = 'J';
        boolean bool = true;

        System.out.println("byte:    " + b);
        System.out.println("short:   " + s);
        System.out.println("int:     " + i);
        System.out.println("long:    " + l);
        System.out.println("float:   " + f);
        System.out.println("double:  " + d);
        System.out.println("char:    " + c);
        System.out.println("boolean: " + bool + "\n");

        // Print Task 4 Constants
        System.out.println("=== Task 4: Constants (final) ===");
        System.out.println("PI:       " + PI);
        System.out.println("MAX_SIZE: " + MAX_SIZE);
        System.out.println("MIN_AGE:  " + MIN_AGE + "\n");

        // ==========================================
        // TASK 5: Identifier Validation Demo
        // ==========================================
        System.out.println("=== Task 5: Valid Identifiers in Action ===");
        String studentName = "Alice";      // Valid: standard camelCase
        String student_name = "Bob";       // Valid: underscore is allowed
        int _marks = 95;                  // Valid: identifiers can start with '_'

        System.out.println("studentName:  " + studentName);
        System.out.println("student_name: " + student_name);
        System.out.println("_marks:       " + _marks);
        // Invalid identifiers (uncommenting causes compilation failure):
        // int 123student = 1;  // Error: cannot start with digit
        // int class = 2;       // Error: 'class' is a reserved keyword
        // int student-name = 3;// Error: '-' interpreted as subtraction operator
        // int student name = 4;// Error: spaces are not permitted
        System.out.println();

        // ==========================================
        // TASK 6: Memory Sizes via Wrapper Classes
        // ==========================================
        System.out.println("=== Task 6: Data Type Memory Sizes ===");
        System.out.println("int:    " + Integer.BYTES + " bytes (" + Integer.SIZE + " bits)");
        System.out.println("long:   " + Long.BYTES + " bytes (" + Long.SIZE + " bits)");
        System.out.println("double: " + Double.BYTES + " bytes (" + Double.SIZE + " bits)");
        System.out.println("char:   " + Character.BYTES + " bytes (" + Character.SIZE + " bits)\n");

        // ==========================================
        // TASK 7: Bonus Decoding Demonstration
        // ==========================================
        System.out.println("=== Task 7: Bonus Executions ===");
        
        // 1. java.lang.Math.pow()
        double base = 2.0;
        double exp = 8.0;
        double powerResult = Math.pow(base, exp);
        System.out.println("Math.pow(2.0, 8.0)  -> " + powerResult);

        // 2. java.time.LocalDate
        LocalDate today = LocalDate.now();
        System.out.println("LocalDate.now()     -> Current system date is " + today);

        // 3. java.util.Scanner
        System.out.println("Scanner instance    -> Ready to read from System.in (" + scanner.getClass().getName() + ")");
        
        scanner.close();
    }
}