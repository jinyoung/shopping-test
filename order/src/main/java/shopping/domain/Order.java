package shopping.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import shopping.OrderApplication;

@Entity
@Table(name = "Order_table")
@Data
//<<< DDD / Aggregate Root
public class Order {

    @Id
    private String orderNumber;

    private String customerName;

    @Embedded
    private LocalDateTime orderDate;

    public static OrderRepository repository() {
        OrderRepository orderRepository = OrderApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }

    public void createOrder(CreateOrderCommand createOrderCommand) {
        //implement business logic here:

        OrderCreated orderCreated = new OrderCreated(this);
        orderCreated.publishAfterCommit();
    }
}
//>>> DDD / Aggregate Root
