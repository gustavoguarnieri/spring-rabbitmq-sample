package br.com.example.spring.rabbitmq.producer.controller

import br.com.example.spring.rabbitmq.producer.model.request.MessageRequest
import br.com.example.spring.rabbitmq.producer.service.RabbitMQProducerService
import mu.KotlinLogging
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/message/publish")
class RabbitMQProducerController(
    private val rabbitMQProducerService: RabbitMQProducerService
) {

    private val log = KotlinLogging.logger {}

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    private fun sendMessage(@RequestBody messageRequest: MessageRequest) {
        log.info("sendMessage: sending message=${messageRequest.description}")
        return rabbitMQProducerService.sendMessage(messageRequest).also {
            log.info("sendMessage: sending message=${messageRequest.description}")
        }
    }
}
