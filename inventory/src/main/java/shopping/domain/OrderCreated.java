package shopping.domain;

import java.util.*;
import lombok.*;
import shopping.domain.*;
import shopping.infra.AbstractEvent;

@Data
@ToString
public class OrderCreated extends AbstractEvent {

    private String orderNumber;
    private String customerName;
    private Object orderDate;
}
