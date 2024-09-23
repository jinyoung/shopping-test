package shopping.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shopping.domain.*;
import shopping.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ProductQuantityUpdated extends AbstractEvent {

    private String productId;
    private Integer quantity;

    public ProductQuantityUpdated(Product aggregate) {
        super(aggregate);
    }

    public ProductQuantityUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
