package task2.product.service;

import org.springframework.stereotype.Service;
import task2.product.api.request.ProductRequest;
import task2.product.api.request.UpdateProductRequest;
import task2.product.api.response.ProductResponse;
import task2.product.domain.Product;
import task2.product.repository.ProductRepository;
import task2.product.support.Mapper;
import task2.product.support.exception.ProductNotFound;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repo;
    private final Mapper mapper;

    public ProductService(ProductRepository repo, Mapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    public ProductResponse create(ProductRequest req) {
        Product saved = repo.save(mapper.toProduct(req));
        return mapper.toProductResponse(saved);
    }

    public ProductResponse find(Long id) {
        Product p = repo.findById(id).orElseThrow(() -> new ProductNotFound(id));
        return mapper.toProductResponse(p);
    }

    public List<ProductResponse> findAll() {
        return repo.findAll().stream().map(mapper::toProductResponse).toList();
    }

    public ProductResponse update(Long id, UpdateProductRequest req) {
        Product p = repo.findById(id).orElseThrow(() -> new ProductNotFound(id));

        Product before = new Product(p.getName());
        before.setId(p.getId());

        p.setName(req.getName());
        repo.save(p);

        return mapper.toProductResponse(before, req);
    }

    public void delete(Long id) {
        Product p = repo.findById(id).orElseThrow(() -> new ProductNotFound(id));
        repo.deleteById(p.getId());
    }
}
