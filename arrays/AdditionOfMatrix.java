//package arrays;

class AdditionOfMatrix {
    public static void main(String[] args) {
        int arr1[][] = {{10,20},{30,40}};
        int arr2[][] = {{5,5},{5,5}};
        int sum[][] = new int[2][2];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for(int[] element : sum){
            for(int val : element){
                System.out.print(val+"\t");
            }System.out.println();
            
        }
        // for(int i=0;i<sum.length;i++){
        //     for(int j=0;j<sum[0].length;j++){
        //         System.out.print(sum[i][j]+"\t");
        //     }System.out.println();
        //     System.out.println();
        // }

        // for(int i=0;i<arr1.length;i++){
        //     for(int j=0;j<arr1[0].length;j++){
        //         System.out.print(arr1[i][j] + arr2[i][j]+"\t");
        //     }System.out.println();
        // }
    }
    
}
