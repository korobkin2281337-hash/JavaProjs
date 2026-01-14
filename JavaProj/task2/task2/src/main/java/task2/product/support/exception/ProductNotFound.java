package task2.product.support.exception;

public class ProductNotFound extends RuntimeException {
    public ProductNotFound(Long id) {
        super(String.format("Product with id %d not found", id));
    }
}
