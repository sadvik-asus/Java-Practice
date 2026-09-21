// program using "consturctor" "object" on bigbasket site

package constructorE;

class Product{
    private int discount;
    private String imageurl;
    private int eta;
    private String brand;
    private String productname;
    private double packsize;
    private float mrp;
    private float mop;
    // constructor
    public Product(int discount,String imageurl, int eta, String brand,String productname,double packsize,float mrp,float mop){
        this.discount = discount;
        this.imageurl = imageurl;
        this.eta = eta;
        this.brand = brand;
        this.productname = productname;
        this.packsize = packsize;
        this.mrp = mrp;
        this.mop = mop;
    }
    public String toString(){
        return "Discount : "+this.discount+"\nImageURL : "+this.imageurl+"\nETA : "+this.eta+
        "\nBrand : "+this.brand+"\nProduct Name : "+this.productname+"\nPacksize : "+this.packsize+
        "\nMRP : "+this.mrp+"\nMOP : "+this.mop+"\n\n"; 
    }
    public static void main(String[] args) {
        // objects and calling constructor
        Product product1 = new Product(10, "C:/Images/Product1", 10, "Freshshot", "Capsicum", 1, 350, 245); 
        Product product2 = new Product(28, "C:/Images/Product2", 10, "Fresho", "Carrot - Orange", 1,88.75F,64.0F);
        Product product3 = new Product(41, "C:/Images/Product3", 10, "Fresho", "Cauliflower", 1, 42.50F,25.00F);
        Product product4 = new Product(40, "C:/Images/Product3", 10, "Fresho", "Corianderleaves-without roots", 1, 181.00F, 144.80F);
        System.out.print(product1);
        System.out.print(product2);
        System.out.print(product3);
        System.out.print(product4);
    }
}