# Hibernate Features Project

This project focuses on exploring and implementing various features of **Hibernate** ORM (Object-Relational Mapping). Hibernate is a powerful framework for Java that simplifies database interactions and provides a robust mechanism for mapping Java objects to database tables.

## Features Implemented

In this project, I am working on several important Hibernate features, including:

### 1. **Entity Mapping**
   - Mapping Java objects to database tables using **annotations** and **XML configuration**.
   - Usage of basic, composite, and embedded IDs for primary key mapping.
   - Mapping relationships like **One-to-One**, **One-to-Many**, **Many-to-One**, and **Many-to-Many**.

### 2. **Session Management**
   - Understanding and implementing **SessionFactory**, **Session**, and their lifecycle.
   - Utilizing **Transaction** API to handle database transactions in a more efficient and robust way.

### 3. **Lazy vs Eager Fetching**
   - Working with different fetching strategies (`LazyLoading` and `EagerLoading`).
   - Managing database performance by optimizing fetching strategies based on use cases.

### 4. **Hibernate Query Language (HQL)**
   - Writing custom queries using HQL to retrieve, update, or delete data from the database.
   - Exploring **Criteria API** and **Native SQL Queries** for advanced query options.

### 5. **Caching Mechanisms**
   - Implementing **First-level cache** (Session Cache) and **Second-level cache** (SessionFactory Cache) to improve performance.
   - Integrating **Ehcache** for second-level caching and fine-tuning cache behavior.

### 6. **Transaction Management**
   - Ensuring **ACID** properties (Atomicity, Consistency, Isolation, Durability) using **JTA (Java Transaction API)** and Hibernate's built-in transaction management.
   - Handling different isolation levels and propagation behaviors.

### 7. **Spring Integration (Optional)**
   - Integrating Hibernate with **Spring** to simplify database access and transaction management.
   - Using **Spring Data JPA** for repository-based access to Hibernate-managed entities.

### 8. **Custom Data Types**
   - Working with **UserType** to map custom Java types to database columns.

## Setup and Installation

### Prerequisites
To run this project, you'll need:

- **Java 8** or higher
- **Hibernate** dependencies
- A **MySQL** or **PostgreSQL** database (can be configured in `hibernate.cfg.xml`)
