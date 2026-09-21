package basic_programs;

class addTwoNumbers{
    public static float add(float a, float b){
        float result = a + b;
        return result;
    }

    public static void main(String args[]){
        float result = add(45,55);
        System.out.println(result);
    }
}