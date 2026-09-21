package basic_programs;

class calculator {
    public static int add(int a, int b){
        int result = a + b;
        return result;
    }
    public static int sub(int a, int b){
        int result = a - b;
        return result;
    }
    public static int mul(int a, int b){
        int result = a * b;
        return result;
    }
    public static int div(int a, int b){
        int result = a / b;
        return result;
    }
    public static int mod(int a, int b){
        int result = a % b;
        return result;
    }

    public static void main(String[] args) {
        int r1 = add(10, 5);
        System.out.println(r1);
        int r2 = sub(10, 5);
        System.out.println(r2);
        int r3 = mul(10, 5);
        System.out.println(r3);
        int r4 = div(10, 5);
        System.out.println(r4);
        int r5 = mod(10, 5);
        System.out.println(r5);
    }
}
