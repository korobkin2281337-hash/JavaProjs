package task2.product.support;

import org.springframework.stereotype.Component;
import task2.product.support.exception.ProductNotFound;

import java.util.function.Supplier;

@Component
public class ExceptionSupplier {

    public Supplier<ProductNotFound> productNotFound(Long id) {
        return () -> new ProductNotFound(id);
    }
}