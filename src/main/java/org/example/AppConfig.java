package org.example;

public class AppConfig {

    public static String applicationId = "HelloProducer";
    public static String bootstrapServers = "localhost:9092,localhost:9093,localhost:9094";
    public static String topicName = "hello-producer-topic";
    public static Integer numEvent = 10000;
}
