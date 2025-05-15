# 🍽️ Restaurant API – Spring Boot Backend

This is a RESTful API built with **Spring Boot** 3 that powers the backend for a restaurant-based web application. It provides structured access to data such as cuisines, dish types, and menu items, and serves that data to a React front-end.

## 🚀 Features

- 🔧 Built with Spring Boot and Java 21+
- 📦 Exposes RESTful endpoints for structured restaurant data
- 🍽️ Supports dish types, cuisine types, and more
- 🧪 Integrated with JPA and an SQL database (e.g., H2, PostgreSQL, MySQL)
- 📄 MIT Licensed – open and visible to employers, safe for learning and reference

## 🗂️ Endpoints Overview

Example endpoints may include:

| Method | Endpoint             | Description                         |
|--------|----------------------|-------------------------------------|
| GET    | `/api/restaurants/{id} ` | Get restaurant by id            |
| GET    | `/api/restaurants`   | Get all restaurants                 |
| POST   | `/api/restaurants`   | Create a new restaurant             |
| PUT    | `/api/restaurants/{id}` | Update a restaurant by ID         |
| DELETE | `/api/restaurants/{id}` | Delete a restaurant by ID         |

_(Actual endpoints may vary as the project evolves)_


## 🧰 Tech Stack

- **Spring Boot** (REST controllers, service layers)
- **Spring Data JPA** (data persistence)
- **H2 / PostgreSQL / MySQL** (interchangeable DB support)
- **Lombok** (cleaner Java code)
- **Jackson** (JSON serialization)
- **CORS Configuration** (for React frontend integration)

## 🎯 Use Case

This API is part of a full-stack project where:
- The **backend** (this repo) handles data and business logic
- The **frontend** (React app) consumes this API to render menus and more

Perfect for portfolio-building, full-stack demos, or learning REST and Java backend architecture.

📄 License

This project is licensed under the MIT License.
You’re free to use and learn from it — but please don’t copy it to build commercial projects.

✨ Future Plans

    Authentication & user management

    Admin-only endpoints

    Integration with a production database

    Docker support for deployment

