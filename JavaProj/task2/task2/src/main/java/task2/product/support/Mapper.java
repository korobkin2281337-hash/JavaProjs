package task2.product.support;

import org.springframework.stereotype.Component;
import task2.product.api.request.ProductRequest;
import task2.product.api.request.UpdateProductRequest;
import task2.product.api.response.ProductResponse;
import task2.product.domain.Product;

@Component
public class Mapper {

    public Product toProduct(ProductRequest req) {
        return new Product(req.getName());
    }

    public ProductResponse toProductResponse(Product p) {
        return new ProductResponse(p.getId(), p.getName());
    }

    public ProductResponse toProductResponse(Product before, UpdateProductRequest req) {
        return new ProductResponse(before.getId(), before.getName());
    }
}
