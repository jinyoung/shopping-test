package shopping.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class UpdateProductQuantityCommand {

    private String productId;
    private Integer quantity;
}
