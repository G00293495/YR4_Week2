package ie.atu.week2.week2_refresher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductContoller {
    private List<Product> productlist = new ArrayList<Product>();

    private ProductService productService;

    @Autowired
    public ProductContoller(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/products")
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product)
    {
        return productService.addProduct(product);
    }

    @PutMapping("/products/update/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {
        return productService.updateProduct(id, updatedProduct);
    }

    @DeleteMapping("/products/delete/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }


}
