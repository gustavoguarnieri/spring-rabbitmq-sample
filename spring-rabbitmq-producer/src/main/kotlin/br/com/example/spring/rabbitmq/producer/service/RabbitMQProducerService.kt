package br.com.example.spring.rabbitmq.producer.service

import br.com.example.spring.rabbitmq.producer.model.request.MessageRequest
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class RabbitMQProducerService(
    @Value("\${rabbitmq.exchange.name}") private val exchange: String,
    @Value("\${rabbitmq.routing.key}") private val routingKey: String,
    private var rabbitTemplate: RabbitTemplate
) {

    fun sendMessage(message: MessageRequest) {
        rabbitTemplate.convertAndSend(exchange, routingKey, message.description)
    }
}
