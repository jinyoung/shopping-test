package shopping.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import shopping.config.kafka.KafkaProcessor;
import shopping.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ProductCreated'"
    )
    public void wheneverProductCreated_InventoryPolicy(
        @Payload ProductCreated productCreated
    ) {
        ProductCreated event = productCreated;
        System.out.println(
            "\n\n##### listener InventoryPolicy : " + productCreated + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderCreated'"
    )
    public void wheneverOrderCreated_InventoryPolicy(
        @Payload OrderCreated orderCreated
    ) {
        OrderCreated event = orderCreated;
        System.out.println(
            "\n\n##### listener InventoryPolicy : " + orderCreated + "\n\n"
        );
        // Sample Logic //

    }
}
//>>> Clean Arch / Inbound Adaptor
