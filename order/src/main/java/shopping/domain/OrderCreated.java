package shopping.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shopping.domain.*;
import shopping.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderCreated extends AbstractEvent {

    private String orderNumber;
    private String customerName;
    private LocalDateTime orderDate;

    public OrderCreated(Order aggregate) {
        super(aggregate);
    }

    public OrderCreated() {
        super();
    }
}
//>>> DDD / Domain Event
