package basic_programs;

class avgOfThreeNumbers {
    public static float avg(float n1, float n2, float n3){
        float result = (n1+n2+n3)/3;
        return result;
    }

    public static void main(String args[]){
        float result = avg(35, 45, 55);
        System.out.println(result);
    }
}
