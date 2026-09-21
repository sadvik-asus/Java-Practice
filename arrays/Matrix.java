//package arrays;

class Matrix {
    public static void main(String[] args) {
        int [][]matrix = {{5,10,15,20,25},{30,35,40,45,50},{55,60,65,70,75}};
        System.out.println("Using for loop : \n");
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[row].length;col++){
                System.out.print(matrix[row][col]+"\t");
            }System.out.println();
            System.out.println();
        }
        System.out.println("\nUsing for-each loop : \n");
        for(int[] row : matrix){
            for(int element : row){
                System.out.print(element+"\t");
            }System.out.println();
            System.out.println();
        }
    }
}
