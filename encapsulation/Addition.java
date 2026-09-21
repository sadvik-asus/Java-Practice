package encapsulation;

public class Addition {
    private int num1;
    private int num2;
    // construcor
    public Addition(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public String toString(){
        return "num 1 : "+this.num1+"num 2 : "+this.num2;
    }
    public void setNum1(int num1){
        this.num1 = num1;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }
    public int getNum1(){
        return this.num1;
    }
    public int getNum2(){
        return this.num2;
    }
    // business method
    public int doSum(){
        return this.num1+this.num2;
    }
    public static void main(String[] args) {
        Addition addition1 = new Addition(20,40);
        int result1 = addition1.doSum();
        System.out.println(result1);
    }
}
