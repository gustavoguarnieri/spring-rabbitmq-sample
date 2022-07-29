package br.com.example.spring.rabbitmq.producer.model.request

import javax.validation.constraints.NotBlank

data class MessageRequest(
    @NotBlank var description: String
)
