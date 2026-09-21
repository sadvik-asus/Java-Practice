class forSeries{
    public static void series1(){
        System.out.print("Series 1 : ");
        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }System.out.println();
    }
    public static void series2(){
        System.out.print("Series 2 : ");
        for(int i=9;i>=0;i--){
            System.out.print(i+" ");
        }System.out.println();
    }
    public static void series3(){
        System.out.print("Series 3 : ");
        for(int i=0;i<=20;i+=2){
            System.out.print(i+" ");
        }System.out.println();
    }
    public static void series4(){
        System.out.print("Series 4 : ");
        for(int i=50;i>=0;i-=5){
            System.out.print(i+" ");
        }System.out.println();
    }
    public static void series5(){
        System.out.print("Series 5 : ");
        for(int i=3;i<=30;i+=3){
            System.out.print(i+" ");
        }System.out.println();
    }
    public static void series6(){
        System.out.print("Series 6 : ");
        for(int i=9;i>=1;i-=2){
            System.out.print(i+" ");
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