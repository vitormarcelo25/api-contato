error id: file:///C:/Users/vitorsantana/Desktop/faculdade/backend-mafra/atividade-3/api-contato/src/main/java/com/uninassau/api_contato/ApiContatoApplication.java:org/springframework/boot/autoconfigure/SpringBootApplication#
file:///C:/Users/vitorsantana/Desktop/faculdade/backend-mafra/atividade-3/api-contato/src/main/java/com/uninassau/api_contato/ApiContatoApplication.java
empty definition using pc, found symbol in pc: org/springframework/boot/autoconfigure/SpringBootApplication#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 152
uri: file:///C:/Users/vitorsantana/Desktop/faculdade/backend-mafra/atividade-3/api-contato/src/main/java/com/uninassau/api_contato/ApiContatoApplication.java
text:
```scala
package com.uninassau.api_contato;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplicati@@on;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Annotation para definir que esta classe é um controlador REST 
public class ApiContatoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiContatoApplication.class, args);
    }

    // Endpoint para buscar contato (GET) [cite: 8, 13]
    @GetMapping("/contato")
    public String obter() {
        return "GET: Contato obtido com sucesso!"; // Retorna mensagem de sucesso [cite: 9]
    }

    // Endpoint para criar contato (POST) [cite: 8, 13]
    @PostMapping("/contato")
    public String criar() {
        return "POST: Contato criado com sucesso!"; // Retorna mensagem de sucesso [cite: 9]
    }

    // Endpoint para atualizar contato (PUT) [cite: 8, 13]
    @PutMapping("/contato")
    public String atualizar() {
        return "PUT: Contato atualizado com sucesso!"; // Retorna mensagem de sucesso [cite: 9]
    }

    // Endpoint para remover contato (DELETE) [cite: 8, 13]
    @DeleteMapping("/contato")
    public String deletar() {
        return "DELETE: Contato removido com sucesso!"; // Retorna mensagem de sucesso [cite: 9]
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: org/springframework/boot/autoconfigure/SpringBootApplication#