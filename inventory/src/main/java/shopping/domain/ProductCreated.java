package shopping.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shopping.domain.*;
import shopping.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ProductCreated extends AbstractEvent {

    private String productId;
    private String productName;
    private Integer quantity;
    private Money price;
    private String category;

    public ProductCreated(Product aggregate) {
        super(aggregate);
    }

    public ProductCreated() {
        super();
    }
}
//>>> DDD / Domain Event
