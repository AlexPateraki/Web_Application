package gr.athtech.service;

import gr.athtech.domain.Product;

import java.util.List;

public interface ProductService extends BaseService<Product,Long>{
    List<Product> getProducts();
    Product getProduct(String serialNumber);
}