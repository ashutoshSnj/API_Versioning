# 🚀 API Versioning in Spring Boot 4

This project demonstrates different types of API Versioning using Spring
Boot 4. API versioning allows you to release new versions of APIs
without breaking existing clients.

This repository contains examples of:

-   Header-Based Versioning
-   URL/Path-Based Versioning
-   Media-Type Versioning
-   Functional Endpoint Versioning

## 🧠 What is API Versioning?

API Versioning helps maintain backward compatibility when APIs evolve.
Whenever you update an API (new fields, new responses, removed data),
older clients may still depend on the previous version.

To avoid breaking them, you create separate versions such as:

    /v1/users
    /v2/users

Each version delivers the required response without affecting the other.

## 📌 Versioning Approaches Covered

### 1️⃣ Header-Based Versioning

In this approach, the client sends the API version inside the request
header:

    API-Version: 1.0

#### ✔ How it works

You configure Spring Boot to read a specific header (e.g.,
"API-Version") and select the correct method based on that version.

    @GetMapping(version = "1.0")
    @PostMapping(version = "2.0")

Configuration:

    configurer.useRequestHeader("API-Version");

#### ✔ When to use

-   When you want a clean URL
-   Enterprise-level APIs

------------------------------------------------------------------------

### 2️⃣ URL / Path-Based Versioning

Most common method, placing the version inside the route:

    /api/v1/get-student
    /api/v2/get-student

#### ✔ How it works

    @RequestMapping("/api/v1")
    @RequestMapping("/api/v2")

#### ✔ When to use

-   Public APIs\
-   Web/mobile clients\
-   Works easily in browser/postman

------------------------------------------------------------------------

### 3️⃣ Media-Type Versioning (Content Negotiation)

Client specifies version inside the Accept header:

    Accept: application/json;v=1

#### ✔ How it works

    produces = "application/json;v=1"

#### ✔ When to use

-   Professional APIs\
-   High flexibility

------------------------------------------------------------------------

### 4️⃣ Functional Endpoint Versioning (Reactive/WebFlux)

Used in reactive programming:

    RouterFunction.route()
        .GET("/hello", version("1.2"), handlerFunction)

#### ✔ When to use

-   Reactive stack\
-   High-performance systems

------------------------------------------------------------------------

## 🧩 Project Structure

    src/main/java/com.build
    │
    ├── Controller.java
    ├── WebConfig.java
    ├── dto/
    │   ├── StudentDto1.java
    │   ├── StudentDto2.java
    └── Application.java

------------------------------------------------------------------------

## 📝 How Versioning Works in Your Project

### ✔ Header-based versioning

    @GetMapping(version = "1.0")
    @PostMapping(version = "2.0")

### ✔ Path-based versioning

Add version inside:

    @RequestMapping("/api/v1")

Not inside `@GetMapping`.

------------------------------------------------------------------------

## 🎯 Key Learning Points

-   Version attribute works only when strategy is configured\
-   Header-based versioning needs Postman\
-   Browser cannot send custom headers\
-   Path-based versioning works everywhere\
-   Can mix header + path versioning\
-   Each version uses separate DTOs

------------------------------------------------------------------------

## 🧪 Testing Instructions

### Header-Based Versioning

Send:

    API-Version: 1.0

Call:

    GET http://localhost:8080/get-student

### Path-Based Versioning

    GET http://localhost:8080/api/v1/get-student
    GET http://localhost:8080/api/v2/get-student

------------------------------------------------------------------------

## 🏁 Conclusion

This project demonstrates modern Spring Boot 4 API Versioning:

-   Easy to understand\
-   Covers header + URL versioning\
-   Beginner + interview friendly\
-   Follows official Spring Boot behavior
