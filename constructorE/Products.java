// 07-08-2026
// Task 1: create a class product with below attributes.

package constructorE;

import java.util.Arrays;

class Products {
    private int productid;
    private String description;
    private String brandname;
    private double[] packsize;
    private String[] ingredients;
    //constructor
    public Products(int productid,String description,String brandname,double packsize[],String ingredients[]){
        this.productid = productid;
        this.description = description;
        this.brandname = brandname;
        this.packsize = packsize;
        this.ingredients = ingredients;
    }
    public String toString(){
        return "Product Id : "+this.productid+
        "\nDescription : "+this.description+
        "\nBrand name : "+this.brandname+
        "\nPack size : "+Arrays.toString(this.packsize)+
        "\nIngredients : "+Arrays.toString(this.ingredients)+
        "\n--------------------------";
    }
    public static void main(String args[]){
        double product1packsize[] = {200,350,750,1000};
        
        String product1ingredients[] = {"Sugar","Palm oil","Hazelnuts","Skimmed-milk powder","Fat reduced COCO","Emulsifier","vanillin"};
        Products product1 = new Products(125898, "hazel-nut spread & pantry", "Nutella",product1packsize, product1ingredients);
        System.out.println(product1);
        
    }
}
