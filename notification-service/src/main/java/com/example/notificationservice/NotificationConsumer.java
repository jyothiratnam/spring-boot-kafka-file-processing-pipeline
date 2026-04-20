package com.example.notificationservice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {

    @KafkaListener(topics = "file_processed", groupId = "notification-group")
    public void handleSuccess(String message) {
        System.out.println("✅ NOTIFICATION: File processed successfully");
        System.out.println(message);
    }

    @KafkaListener(topics = "file_failed", groupId = "notification-group")
    public void handleFailure(String message) {
        System.out.println("❌ NOTIFICATION: File processing failed");
        System.out.println(message);
    }
}