package com.novando.springrabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(PostStatus postStatus){
        System.out.println("Me llego un mensaje");
        System.out.println(postStatus.toString());
        System.out.println("Fin del mensaje");
    }
}
