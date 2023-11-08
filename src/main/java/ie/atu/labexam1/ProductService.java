package ie.atu.labexam1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService {

    private ProductClient productClient;

    public ProductService (ProductClient productClient) {
        this.productClient = productClient;
    }

    public void addProduct(Product product, Warehouse warehouse) {
        if (product.getWarehouseId() == warehouse.getWarehouseId() && warehouse.getCapacity() > 0) {
            System.out.println("Product Added");
        } else {
            System.out.println("No space available to add Product");
        }

    }

    public Warehouse getProductById(Product product) {
        int id = product.getWarehouseId();
        Warehouse warehouse = new Warehouse();
        warehouse.setWarehouseId(id);
        addProduct(product, warehouse);
        return productClient.getData(warehouse);
    }


}
