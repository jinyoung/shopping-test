package shopping.infra;
import shopping.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/products")
@Transactional
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @RequestMapping(value = "/products/{id}//products/{productId}/quantity",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Product updateProductQuantity(@PathVariable(value = "id")  id, @RequestBody UpdateProductQuantityCommand updateProductQuantityCommand, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /product/updateProductQuantity  called #####");
            Optional<Product> optionalProduct = productRepository.findById(id);
            
            optionalProduct.orElseThrow(()-> new Exception("No Entity Found"));
            Product product = optionalProduct.get();
            product.updateProductQuantity(updateProductQuantityCommand);
            
            productRepository.save(product);
            return product;
            
    }
}
//>>> Clean Arch / Inbound Adaptor
