package shopping.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class CreateProductCommand {

    private String productId;
    private String productName;
    private Integer quantity;
    private Money price;
    private String category;
}
