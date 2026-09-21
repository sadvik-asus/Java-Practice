class whileSeries {
    //series 1: 1,2,3,4,....,10
    public static void series1(){
        int i = 0;
        System.out.print("series 1 : ");
        while(i<=10){
            System.out.print(i+" ");
            i++ ;
        }System.out.println();
    }
    //series 2: 9,8,7,6,....,0
    public static void series2(){
        int i = 9;
        System.out.print("series 2 : ");
        while(i>=0){
            System.out.print(i+" ");
            i--;
        }System.out.println();
    }
    public static void series3(){
        int i = 0;
        System.out.print("series 3 : ");
        while(i<=20){
            System.out.print(i+" ");
            i += 2;
        }System.out.println();
    }
    public static void series4(){
        int i = 50;
        System.out.print("series 4 : ");
        while(i>=0){
            System.out.print(i+" ");
            i -= 5;
        }System.out.println();
    }
    public static void series5(){
        int i = 3;
        System.out.print("series 5 : ");
        while(i<=30){
            System.out.print(i+" ");
            i += 3;
        }System.out.println();
    }
    public static void series6(){
        int i = 9;
        System.out.print("series 6 : ");
        while(i>=0){
            System.out.print(i+" ");
            i -= 2;
        }System.out.println();
    }
    public static void main(String[] args) {
        series1();
        series2();
        series3();
        series4();
        series5();
        series6();
    }
}
