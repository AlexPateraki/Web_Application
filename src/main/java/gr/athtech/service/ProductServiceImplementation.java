package gr.athtech.service;

import gr.athtech.domain.Product;
import gr.athtech.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImplementation extends BaseServiceImplementation<Product> implements ProductService {
    private final ProductRepository productRepository;
    private final ProductCategoryService categoryService;

    @Override
    protected JpaRepository<Product, Long> getRepository() {
        return productRepository;
    }
    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(String serialNumber) {
        return productRepository.findBySerialNumber(serialNumber);
    }

    @Override
    @Transactional(readOnly = true)
    public Product findBySerialNumber(final String serialNumber) {
        return productRepository.findBySerialNumber(serialNumber);
    }

    @Override
    public Product create(final Product product, final Long categoryId) {
        var category = categoryService.get(categoryId);
        product.setCategory(category);
        return productRepository.save(product);
    }
}

