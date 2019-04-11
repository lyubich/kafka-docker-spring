package ru.alyubich.kafka_docker_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaDockerSpring {

    public static void main(String[] args) {
        System.out.println("Kafka-Docker-Spring start");
        SpringApplication.run(KafkaDockerSpring.class, args);
    }
}
