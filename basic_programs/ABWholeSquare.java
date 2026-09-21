package basic_programs;

class aPlusBWholeSquare {

    public static int square(int a, int b){
        int result = (a*a) + (b*b) + 2*(a*b);
        return result;
    }
    
    public static void main(String[] args) {
        int result = square(3, 4);
        System.out.println(result);
    }
}
