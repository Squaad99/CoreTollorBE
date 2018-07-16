package coretollor.coretollor.service;

import coretollor.coretollor.entity.Addon;
import coretollor.coretollor.entity.Product;
import coretollor.coretollor.model.ProductModel;
import coretollor.coretollor.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductModel addProduct(ProductModel productModel){
        Product newProduct = productRepository.save(new Product(productModel));
        return new ProductModel(productModel);
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }

    public List<ProductModel> getAllProducts(){
        List<Product> products = productRepository.findAll();
        List<ProductModel> productModels = new ArrayList<>();
        for(Product product: products) {
            productModels.add(new ProductModel(product));
        }
        return productModels;
    }

    public Product updateProduct(ProductModel productModel) {
        Product newProduct = productRepository.findById(productModel.getId()).get();
        newProduct.setBaseP(productModel.getBaseP());
        newProduct.setBaseM(productModel.getBaseM());
        newProduct.setOneSideP(productModel.getOneSideP());
        newProduct.setOneSideM(productModel.getOneSideM());
        newProduct.setTwoSideP(productModel.getTwoSideP());
        newProduct.setTwoSideM(productModel.getTwoSideM());
        newProduct.setThreeSideP(productModel.getThreeSideP());
        newProduct.setThreeSideM(productModel.getThreeSideM());
        newProduct.setCompartmentP(productModel.getCompartmentP());
        newProduct.setCompartmentM(productModel.getCompartmentM());
        return productRepository.save(newProduct);
    }

}
