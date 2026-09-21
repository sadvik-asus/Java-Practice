class Syntax3 {
    public static void main(String[] args) {
        int arr[][] = {{5,6},{7,8}};

        for(int []row : arr){
            for(int values : row){
                System.out.print(values+"\t");
            }System.out.println();
        }
    }
}
