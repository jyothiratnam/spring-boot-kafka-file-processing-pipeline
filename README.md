<p align="center">
  <img src="architecture.png" width="900"/>
</p>

<h1 align="center">🚀 Kafka File Processing Pipeline</h1>

<p align="center">
  A production-style event-driven microservices pipeline using Apache Kafka & Spring Boot
</p>
<p align="center">
  <img src="https://img.shields.io/badge/Java-17-blue"/>
  <img src="https://img.shields.io/badge/SpringBoot-3.x-green"/>
  <img src="https://img.shields.io/badge/Kafka-EventDriven-orange"/>
  <img src="https://img.shields.io/badge/Docker-Enabled-blue"/>
</p>

## 🔍 Keywords

Apache Kafka, Spring Boot Kafka, Kafka Producer Consumer, Event Driven Architecture, Microservices, File Processing Pipeline

---


## 📖 Overview

This project demonstrates a **real-world event-driven architecture** where multiple microservices communicate asynchronously using **Apache Kafka**.

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

### Start Kafka & ZooKeeper

```bash
docker-compose up -d
```

### Run Services
```bash
cd upload-service && mvn spring-boot:run  
cd processing-service && mvn spring-boot:run  
cd notification-service && mvn spring-boot:run  
```

### Test API
POST http://localhost:8080/files/upload

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
<p align="center"> <img src="processing-service.png" width="900"/> </p> <p align="center"> Consumes messages from <code>file_uploaded</code>, processes file, and publishes to <code>file_processed</code> or <code>file_failed</code> </p>

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

# 🎯 Key Learnings
1. Built Kafka Producer & Consumer services
2. Implemented event-driven microservices architecture
3. Learned asynchronous communication using Kafka topics
4. Designed loosely coupled distributed systems

## 👨‍💻 Author

Jyothi Ratnam
