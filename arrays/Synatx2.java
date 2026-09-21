class Synatx2 {
    public static void main(String[] args) {
        int arr[][] = new int[][] {{1,2},{3,4}};

        for(int []row : arr){
            for(int values : row){
                System.out.print(values+"\t");
            }System.out.println();
        }
    }
}
