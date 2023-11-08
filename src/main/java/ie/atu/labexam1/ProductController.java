package ie.atu.labexam1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final ProductService ps;

    public ProductController(ProductService ps) {
        this.ps = ps;
    }

    @PostMapping("/products")
    public Object addNewProduct(@RequestBody Product product) {
        return;
    }

}
