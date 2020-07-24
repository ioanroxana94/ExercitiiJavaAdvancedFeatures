package entities;
import javax.persistence.*;

@NamedQueries({
        @NamedQuery(name= "Delete_Product_By_Number_Of_Clients", query = "delete Product where numberOfClients < :numberOfClients"),
        @NamedQuery(name= "Update_Product_Price", query = "update Product set price = price + (price * 20.0 / 100.0) where productName= :productName"),
        @NamedQuery(name= "Select_Product_By_Number_Of_Clients", query = "select product from Product product where product.numberOfClients > :numberOfClients"),
        @NamedQuery(name= "Select_Version_By_Product_Name", query= "select version from Product version where version.productName= : productName")
})

@Entity
@Table(name= "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "version")
    private String version;
    @Column(name = "number_of_clients")
    private int numberOfClients;
    @Column(name = "price")
    private int price;

    public Product(String productName, String version, int numberOfClients, int price){
        this.productName=productName;
        this.version=version;
        this.numberOfClients=numberOfClients;
        this.price=price;
    }

    public Product(){

    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getVersion() {
        return version;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setNumberOfClients(int numberOfClients) {
        this.numberOfClients = numberOfClients;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", version='" + version + '\'' +
                ", numberOfClients=" + numberOfClients +
                ", price=" + price +
                '}';
    }
}
