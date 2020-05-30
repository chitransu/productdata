package com.chits.springdata.product;

import com.chits.springdata.product.entities.Product;
import com.chits.springdata.product.repos.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProductdataApplicationTests {

    @Autowired
    ProductRepository productRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testCreate(){
        Product product =new Product();
        product.setId(1);
        product.setName("RedMe Pro");
        product.setDesc("Good phone in low price");
        product.setPrice(89.9);
        productRepository.save(product);
    }

    @Test
    public void testRead(){
        Optional<Product> productOptional = productRepository.findById(1);
        if(productOptional.isPresent()){
            System.out.println("product description "+productOptional.get().getDesc());
            Assertions.assertEquals("RedMe Pro",productOptional.get().getName());
        }
    }

    @Test
    public void testUpdate(){
        Optional<Product> productOptional = productRepository.findById(1);
        if(productOptional.isPresent()){
           Product product = productOptional.get();
           product.setPrice(99.1);
           productRepository.save(product);
        }
    }

    @Test
    public void testDelete(){
        if(productRepository.existsById(1)){
            productRepository.deleteById(1);
        }
    }

    @Test
    public void testCount(){
        System.out.println("Total no of records : "+productRepository.count());
    }

}
