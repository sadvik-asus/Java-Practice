//package arrays;

class AdditionOfMatrix {
    public static void main(String[] args) {
        int arr1[][] = {{10,20},{30,40}};
        int arr2[][] = {{5,5},{5,5}};
        int sum[][] = addMatrices(arr1, arr2);

        for(int[] element : sum){
            for(int val : element){
                System.out.print(val+"\t");
            }System.out.println();
        }
    }

    public static int[][] addMatrices(int[][] first, int[][] second) {
        if (first == null || second == null || first.length != second.length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }

        int[][] sum = new int[first.length][];
        for (int row = 0; row < first.length; row++) {
            if (first[row] == null || second[row] == null
                    || first[row].length != second[row].length) {
                throw new IllegalArgumentException("Matrices must have the same dimensions");
            }
            sum[row] = new int[first[row].length];
            for (int column = 0; column < first[row].length; column++) {
                sum[row][column] = first[row][column] + second[row][column];
            }
        }
        return sum;
    }
}
