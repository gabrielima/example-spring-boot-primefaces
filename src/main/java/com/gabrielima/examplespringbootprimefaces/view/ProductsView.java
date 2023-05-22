package com.gabrielima.examplespringbootprimefaces.view;

import com.gabrielima.examplespringbootprimefaces.models.Product;
import com.gabrielima.examplespringbootprimefaces.services.ProductService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Component
@ViewScoped
public class ProductsView implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Autowired
    private ProductService productService;

    private List<Product> products;

    @PostConstruct
    public void init() {
        products = productService.findAll();
    }
}