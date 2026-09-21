package encapsulation;

class Cube {
    private int n;
    public Cube(int n){
        this.n = n;
    }
    public void setN(int n){
        this.n = n;
    }
    public int getN(){
        return this.n;
    }
    public String toString(){
        return "N : "+this.n;
    }
    // business method
    public int doCube(){
        return n*n*n;
    }
    public static void main(String[] args) {
        Cube cube2 = new Cube(2);
        int result1 = cube2.doCube();
        System.out.println(result1);
    }
}
