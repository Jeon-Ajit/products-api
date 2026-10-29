
package uk.ac.westminster.products_api;
import uk.ac.westminster.products_api.Product;
// A PhysicalProduct IS-A Product because every physical product
// has an id, name and price inherited from Product.

// A ShoppingCart is NOT a Product because it contains products,
// which is a HAS-A relationship rather than an IS-A relationship.
public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    public PhysicalProduct(){

    }
    public PhysicalProduct(Long id,String name,double price,double weightKg,String dimensions){
        super(id,name,price);
        this.weightKg=weightKg;
        this.dimensions=dimensions;
    }
    public double getWeightKg(){
        return weightKg;
    }
    public String getDimensions(){
        return dimensions;
    }
}
