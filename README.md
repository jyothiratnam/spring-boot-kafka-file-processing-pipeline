# 🚀 Kafka File Processing Pipeline

> Event-driven microservices architecture using Apache Kafka & Spring Boot

---

## 📖 Overview

This project demonstrates a **real-world event-driven architecture** where multiple microservices communicate asynchronously using **Apache Kafka**.

---

## 🧠 Architecture Diagram

![Architecture Diagram](architecture.png)

---

## 🧠 Architecture (Event Flow)

Client  
↓  
Upload Service (8080)  
↓  
Kafka Topic: file_uploaded  
↓  
Processing Service (8081)  
↓  
Kafka Topic: file_processed / file_failed  
↓  
Notification Service (8082)  

---

## 📂 Project Structure

kafka-file-processing/  
│  
├── upload-service/  
├── processing-service/  
├── notification-service/  
├── docker-compose.yml  
├── architecture.png  
└── README.md  

---

## ⚙️ Tech Stack

- Java
- Spring Boot
- Apache Kafka
- Docker
- REST APIs

---

## 🔥 Key Features

- Kafka Producer & Consumer  
- Event-driven microservices  
- Asynchronous processing  
- Fault-tolerant design  

---

## 🚀 Getting Started

### Start Kafka
docker compose up -d

### Run Services
cd upload-service && mvn spring-boot:run  
cd processing-service && mvn spring-boot:run  
cd notification-service && mvn spring-boot:run  

---

## 📥 Kafka Topics

- file_uploaded  
- file_processed  
- file_failed  

---

## 📸 Screenshots

### 📤 Upload Service (Producer)
<p align="center">
  <img src="upload-service-log.png" width="900"/>
</p>

---

### ⚙️ Processing Service (Consumer + Producer)
<p align="center">
  <img src="processing-service.png" width="900"/>
</p>

---

### 🔔 Notification Service (Consumer)
<p align="center">
  <img src="notification-service-log.png" width="900"/>
</p>

---

### 🌐 API Testing (Postman)
<p align="center">
  <img src="postman.png" width="900"/>
</p>

### ⚙️ Processing Service (Consumer + Producer)
Consumes messages from `file_uploaded`, processes file, and publishes to `file_processed` or `file_failed`

## 👨‍💻 Author

Jyothi Ratnam
