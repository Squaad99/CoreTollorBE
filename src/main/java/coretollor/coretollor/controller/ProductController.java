package coretollor.coretollor.controller;

import coretollor.coretollor.model.ProductModel;
import coretollor.coretollor.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<ProductModel> addProduct(@RequestBody ProductModel productModel){
        this.productService.addProduct(productModel);
        return new ResponseEntity<>(productModel, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    private ResponseEntity<List<ProductModel>> getAllProducts() {
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{productId}", method = RequestMethod.DELETE)
    private ResponseEntity deleteProductById(@PathVariable("productId") Long id) {
        productService.deleteProduct(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT)
    private ResponseEntity<ProductModel> updateProduct(@RequestBody ProductModel productModel) {
        return new ResponseEntity<>(new ProductModel(productService.updateProduct(productModel)), HttpStatus.OK);
    }



}
