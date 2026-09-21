//package arrays;

class TwoDArray {
    public static void main(String[] args) {
        int [][]values = {{10,12,14},{21,22,23}};
        System.out.println("\n Using for loop : \n");
        for(int row=0;row<values.length;row++){
            for(int column=0;column<values[row].length;column++){
                System.out.print(values[row][column]+"\t");
            }System.out.println();
            System.out.println();
        }

        System.out.println("\n Using for-each loop : \n");
        for(int[] row : values){
            for(int val : row){
                System.out.print(val+"\t");
            }System.out.println();
            System.out.println();
        }
    }
}
