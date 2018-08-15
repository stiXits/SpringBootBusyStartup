package com.example.demo;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class Handler {

    @StreamListener(target = Sink.INPUT)
    public void handle(String foobar) {

        System.out.println("Received: " + foobar);
    }


}
