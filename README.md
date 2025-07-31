Neobanco2 es una aplicación backend desarrollada con Spring Boot que implementa un sistema de autenticación y gestión de usuarios en etapa inicial para un banco digital. Utiliza MySQL como base de datos y JWT para autenticación.

## Arquitectura


- **Monolítica**: El proyecto sigue una arquitectura monolítica con capas claras.
- **Capas**:
    - **Modelo**: Entidades JPA (`User`, `UserPermission`) que mapean la base de datos.
    - **Repositorio**: Interfaces (`UserRepository`, `UserPermissionRepository`) para operaciones con la base de datos.
    - **Servicio**: Lógica de negocio en clases como `UserService` y `JwtService`.
    - **Controlador**: Endpoints REST en `UserController` y `AuthController` (ej. `/api/users/register`, `/api/auth/login`).
    - **Configuración**: Seguridad con Spring Security y JWT en `SecurityConfig` y `JwtAuthenticationFilter`.

## Requisitos

- Java 17
- Maven 3.8+
- MySQL 8.0+
- IntelliJ IDEA (recomendado)
- Postman (para pruebas de API)

## Instalación

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/oscarjg0118/neobanco2.git
   cd neobanco2