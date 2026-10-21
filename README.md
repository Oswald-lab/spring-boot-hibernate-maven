# Spring Boot + Hibernate sample (Maven)

Two frameworks declared in the root `pom.xml`:
1. **Spring Boot** 3.3.5 (`spring-boot-starter-parent`, `spring-boot-starter-web`, `spring-boot-maven-plugin`)
2. **Hibernate ORM** (via `spring-boot-starter-data-jpa`; entity uses `org.hibernate.annotations.CreationTimestamp`)

Build: `mvn clean package`   Run: `mvn spring-boot:run`   Try: `curl localhost:8080/books`
