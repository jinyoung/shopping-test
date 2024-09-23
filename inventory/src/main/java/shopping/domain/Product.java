package shopping.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import shopping.InventoryApplication;

@Entity
@Table(name = "Product_table")
@Data
//<<< DDD / Aggregate Root
public class Product {

    @Id
    private String productId;

    private String productName;

    private Integer quantity;

    @Embedded
    private Money price;

    private String category;

    public static ProductRepository repository() {
        ProductRepository productRepository = InventoryApplication.applicationContext.getBean(
            ProductRepository.class
        );
        return productRepository;
    }

    public void createProduct(CreateProductCommand createProductCommand) {
        //implement business logic here:

        ProductCreated productCreated = new ProductCreated(this);
        productCreated.publishAfterCommit();
    }

    //<<< Clean Arch / Port Method
    public void updateProductQuantity(
        UpdateProductQuantityCommand updateProductQuantityCommand
    ) {
        //implement business logic here:

        ProductQuantityUpdated productQuantityUpdated = new ProductQuantityUpdated(
            this
        );
        productQuantityUpdated.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
