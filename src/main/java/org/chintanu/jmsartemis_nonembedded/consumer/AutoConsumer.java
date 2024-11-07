package org.chintanu.jmsartemis_nonembedded.consumer;

import jakarta.jms.Message;
import lombok.RequiredArgsConstructor;
import org.chintanu.jmsartemis_nonembedded.model.HelloWorldModel;
import org.chintanu.jmsartemis_nonembedded.producer.AutoProducer;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AutoConsumer {

    private final JmsTemplate jmsTemplate;

    @JmsListener(destination = AutoProducer.SIMPLE_QUEUE)
    public void pop(@Payload HelloWorldModel model, @Headers MessageHeaders headers, Message message) {

        System.out.println("Popped the SIMPLE_QUEUE queue now");
        System.out.println(message);
        System.out.println(model);
    }
}
