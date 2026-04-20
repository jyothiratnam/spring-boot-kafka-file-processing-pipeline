package com.example.processingservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @KafkaListener(topics = "file_uploaded", groupId = "processing-group")
    public void consume(String message) {

        System.out.println("📥 Received: " + message);

        try {
            Thread.sleep(2000);

            // 🔥 Modify message
            String updatedMessage = message.replace("UPLOADED", "PROCESSED");

            kafkaTemplate.send("file_processed", updatedMessage);

            System.out.println("⚙️ Processing done");

        } catch (Exception e) {

            String failedMessage = message.replace("UPLOADED", "FAILED");

            kafkaTemplate.send("file_failed", failedMessage);
        }
    }
}