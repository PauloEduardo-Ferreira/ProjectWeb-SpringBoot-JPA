# 🛒 Projeto Web com Spring Boot e JPA

Este é um projeto completo desenvolvido com **Spring Boot**, **JPA/Hibernate** e arquitetura em camadas, simulando um sistema de pedidos com usuários, categorias, produtos, pedidos e pagamentos.

O projeto segue uma estrutura limpa e organizada, com entidades bem modeladas, relacionamento entre tabelas, camada de serviços, repositórios, recursos REST e tratamento de exceções.

---

## 📦 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database (modo de teste)**
- **PostgreSQL ou outro banco (produção)**
- **Maven**

---

## 🧱 Estrutura do Projeto

A estrutura principal segue o padrão:

```
src/main/java/com.projetoweb.ProjetoWebJava
│
├── ProjetoWebJavaApplication.java
├── TestConfig.java
│
├── entities/
│     ├── Category.java
│     ├── Order.java
│     ├── OrderItem.java
│     ├── OrderItemPK.java
│     ├── Payment.java
│     ├── Product.java
│     └── User.java
│
├── entities/enums/
│     └── OrderStatus.java
│
├── repositories/
│     ├── CategoryRepository.java
│     ├── OrderItemRepository.java
│     ├── OrderRepository.java
│     ├── ProductRepository.java
│     └── UserRepository.java
│
├── resources/
│     ├── CategoryResource.java
│     ├── OrderResource.java
│     ├── ProductResource.java
│     └── UserResource.java
│
├── resources/exceptions/
│     ├── ResourceExceptionHandler.java
│     ├── StandardError.java
│     └── DatabaseException.java
│
├── services/
│     ├── CategoryService.java
│     ├── OrderService.java
│     ├── ProductService.java
│     └── UserService.java
│
└── services/exceptions/
      ├── ResourceNotFoundException.java
      └── DatabaseException.java
```

---

## 🚀 Como Executar o Projeto

### 1. Clonar o repositório
```
git clone https://github.com/PauloEduardo-Ferreira/ProjectWeb-SpringBoot-JPA.git
```

### 2. Entrar no diretório
```
cd ProjectWeb-SpringBoot-JPA
```

### 3. Executar com Maven
```
mvn spring-boot:run
```

### 4. Acessar o servidor
```
http://localhost:8080
```

---

## 🗄️ Banco de Dados

### Modo Teste (H2)
Acessar console:
```
http://localhost:8080/h2-console
```

### Produção
Configurar `application.properties`.

---

## 📌 Funcionalidades implementadas

✔ CRUD de Usuários  
✔ CRUD de Produtos  
✔ CRUD de Categorias  
✔ CRUD de Pedidos  
✔ Relacionamentos completos  
✔ Tratamento de erros  
✔ População automática do banco no perfil de teste  

---

## 🧪 Endpoints Principais

### Usuários
```
GET /users
GET /users/{id}
POST /users
PUT /users/{id}
DELETE /users/{id}
```

### Produtos
```
GET /products
GET /products/{id}
```

### Categorias
```
GET /categories
GET /categories/{id}
```

### Pedidos
```
GET /orders
GET /orders/{id}
```

---

## 👤 Autor

**Paulo Eduardo**  
Linkedin: https://www.linkedin.com/in/paulo-ferreira-dev/
