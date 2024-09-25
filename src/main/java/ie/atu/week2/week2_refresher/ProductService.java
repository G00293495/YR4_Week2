package ie.atu.week2.week2_refresher;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> productlist = new ArrayList<Product>();

    public List<Product> getAllProducts() {
        return productlist;
    }

    public Product addProduct(Product product) {
        productlist.add(product);
        return product;
    }

    public Product updateProduct(Long id, Product updatedProduct) {
        for (Product product : productlist) {
            if (product.getId().equals(id)) {
                product.setName(updatedProduct.getName());
                product.setPrice(updatedProduct.getPrice());
                return product;
            }
        }
        return updatedProduct;
    }

    public Product deleteProduct(Long id) {
        for (Product product : productlist) {
            if (product.getId().equals(id)) {
                productlist.remove(product);
                return product;
            }

        }
        return null;

    }
}