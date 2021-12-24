package com.covido.vaccine.config;

import com.covido.vaccine.constants.GlobalConstants;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessagingConfig {

    @Bean
    public Queue queue() {
        return new Queue(GlobalConstants.VACCINE_QUEUE);
    }

    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange(GlobalConstants.VACCINE_EXCHANGE);
    }

    @Bean
    public Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(GlobalConstants.VACCINE_ROUTING_KEY);
    }
}