class Syntax1 {
    public static void main(String[] args) {
        int  arr[][] = new int[2][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;

        for(int []row : arr){
            for(int values : row){
                System.out.print(values+"\t");
            }System.out.println();
        }
    }
}
