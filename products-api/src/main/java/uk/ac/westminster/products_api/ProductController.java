package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController    //waiter
@RequestMapping("/products")  // products menu
public class ProductController {

    @GetMapping("/{id}")  //customer ordering
    public Product getById(@PathVariable Long id) {   //customer ordering id
        return new Product(id, "Laptop", 999.99);   //returning the food
    }


}
