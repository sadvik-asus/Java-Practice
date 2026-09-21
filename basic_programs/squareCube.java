package basic_programs;
class squareCube {
    public static int square(int n){
        int result = n * n;
        return result;
    }
    public static int cube(int n){
        int result = n*n*n ;
        return result;
    }

    public static void main(String[] args) {
        int r1 = square(5);
        int r2 = cube(5);
        System.out.println(r1);
        System.out.println(r2);
    }
}
