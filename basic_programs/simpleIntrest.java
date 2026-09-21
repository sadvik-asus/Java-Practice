package basic_programs;
class simpleIntrest {
    
    public static double SInterest(double p, double t, double r){
        double result = (p*t*r)/100;
        return result;
    }

    public static void main(String args[]){
        double result = SInterest(200000, 1, 24);
        System.out.println(result);
    }
}
