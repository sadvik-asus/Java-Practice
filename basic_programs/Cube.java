package basic_programs;

class Cube {
    
    public static int cube(int n){
        int result = n * n * n ;
        return result;
    }

    public static void main(String args[]){
        int result = cube(5);
        System.out.println(result);
    }
}
