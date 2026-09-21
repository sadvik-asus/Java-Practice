package basic_programs;
class Square {
    public static int square(int n){
        int result = n * n ;
        return result;
    }

    public static void main(String args[]){
        int result = square(5);
        System.out.println(result);
    }
}
