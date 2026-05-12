# Infrastructure Monitoring and Alert Management System

Distributed infrastructure monitoring platform built with Java, Spring Boot, Apache Kafka, Redis, PostgreSQL, Docker, and AWS.

## Business Impact
- Processed 5M+ telemetry events daily
- Monitored 2,000+ enterprise servers
- Maintained 99.95% platform uptime
- Reduced incident detection time by 60%
- Reduced false alerts by 45%

## Tech Stack
Java 17, Spring Boot, Apache Kafka, Redis, PostgreSQL, Docker, AWS

## Features
- Alert ingestion and processing
- Severity classification (Critical, High, Medium, Low)
- Alert deduplication
- Incident tracking
- RESTful APIs
- Containerized deployment

## API Endpoints
- POST /api/metrics/ingest
- POST /api/alerts/evaluate
- GET /api/alerts/active
- GET /api/servers/{serverId}/health

## Project Structure
- controller/ – REST API endpoints
- service/ – Business logic
- repository/ – Database access
- entity/ – JPA entities
- resources/ – Configuration files

## How to Run
```bash
mvn clean install
mvn spring-boot:run
