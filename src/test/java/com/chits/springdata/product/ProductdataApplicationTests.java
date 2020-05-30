package com.chits.springdata.product;

import com.chits.springdata.product.entities.Product;
import com.chits.springdata.product.repos.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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

        productRepository.save(product);
    }

}
