# 📞 API Contato - Atividade 3

Este projeto é uma **API REST** simples desenvolvida como parte da disciplina de Back-end. O objetivo é demonstrar o funcionamento dos quatro métodos HTTP principais utilizando o framework **Spring Boot**.

## 🚀 Tecnologias Utilizadas
- **Java** ☕
- **Spring Boot** 🍃
- **Maven** 📦
- **Postman** 📮 (para testes de API)

## 🛠️ Endpoints da API
A API responde no endereço `http://localhost:8080/contato` com os seguintes métodos:

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| **GET** | `/contato` | Retorna mensagem de sucesso na leitura. |
| **POST** | `/contato` | Retorna mensagem de sucesso na criação. |
| **PUT** | `/contato` | Retorna mensagem de sucesso na atualização. |
| **DELETE** | `/contato` | Retorna mensagem de sucesso na remoção. |

## 🏁 Como Executar
1. Clone o repositório.
2. Certifique-se de ter o **JDK 17+** instalado.
3. Execute a aplicação através da sua IDE (VS Code/IntelliJ) ou via terminal com `./mvnw spring-boot:run`.
4. Utilize o **Postman** para enviar requisições para a URL mencionada acima.
