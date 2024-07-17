package laptopshop.service;

import java.util.List;

import java.util.Optional;

import org.springframework.stereotype.Service;

import laptopshop.domain.Product;
import laptopshop.repository.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> fetchProducts() {
        return this.productRepository.findAll();
    }

    public Product createProduct(Product product) {
        return this.productRepository.save(product);
    }

    // public Optional<Product> fetchProductById(long id) {
    // return this.productRepository.findById(id);
    // }

    public Product fetchProductById(long id) {
        return this.productRepository.findById(id).get();
    }

    public void deleteProduct(long id) {
        this.productRepository.deleteById(id);
    }
}
