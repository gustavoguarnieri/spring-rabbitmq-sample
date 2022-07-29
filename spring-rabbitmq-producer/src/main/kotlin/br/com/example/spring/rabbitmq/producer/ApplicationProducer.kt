package br.com.example.spring.rabbitmq.producer

import org.springframework.amqp.rabbit.annotation.EnableRabbit
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
@EnableRabbit
@SpringBootApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}