# Spring RabbitMQ Sample

This project is an example of how to publish and consume messages to a queue using RabbitMQ

## Requirements

Java 11+

IntelliJ IDEA / Netbeans / Eclipse

RabbitMQ

## Usage

```python

1) Execute the commands below: 

    1.1) docker-compose up -d
    1.2) docker exec rabbitmq rabbitmq-plugins enable rabbitmq_management
    1.3) docker exec rabbitmq rabbitmqctl add_user test test    
    1.4) docker exec rabbitmq rabbitmqctl set_user_tags test administrator
    1.5) docker exec rabbitmq rabbitmqctl set_permissions -p rabbitmq-host test ".*" ".*" ".*"

```

## Documentation

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)