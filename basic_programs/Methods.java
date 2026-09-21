package basic_programs;
// AIM : all programs using methods
class Methods{

    public static void greetings(){
        System.out.println("Welcome to java");
    }

    public static void addTwoNumbers(float a, float b){
        float result = a+b;
        System.out.println("sum of two numbers : "+result);
    }

    public static void average(float n1, float n2, float n3) {
        float result = (n1 + n2 + n3)/3;
        System.out.println("Average of 3 numbers : "+result);
    }

    public static void square(int n){
        int result = (n * n);
        System.out.println("Square of number: "+result);
    }

    public static void cube(int n){
        int result = (n * n * n);
        System.out.println("Cube of a number : "+result);
    }

    public static void aPlusBWholeSquare(int a, int b){
        int result = (a*a) + (b*b) + 2 * (a * b);
        System.out.println("(a + b)^2 : "+result);
    }
    
    public static void simpleInterest(double p, double t, double  r){
        double result = (p * t * r)/100;
        System.out.println("Simple Interest : "+result);
    }
    public static void main(String[] args) {
        greetings();
        addTwoNumbers(2.5f,3.5f);
        addTwoNumbers(30,40);
        average(45, 65, 40);
        square(5);
        square(9);
        cube(5);
        cube(3);
        aPlusBWholeSquare(2, 3);
        simpleInterest(200000, 1, 24);
    }
}