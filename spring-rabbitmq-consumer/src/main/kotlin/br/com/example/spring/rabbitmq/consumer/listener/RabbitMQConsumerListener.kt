package br.com.example.spring.rabbitmq.consumer.listener

import mu.KotlinLogging
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Service

@Service
class RabbitMQConsumerListener {

    private val log = KotlinLogging.logger {}

    @RabbitListener(queues = ["\${rabbitmq.queue.name}"])
    fun consumeMessage(message: String?) {
        log.info("consumeMessage: received message=$message")
    }
}