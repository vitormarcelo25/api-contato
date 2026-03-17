package com.uninassau.api_contato;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController  
public class ApiContatoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiContatoApplication.class, args);
    }

    @GetMapping("/contato")
    public String obter() {
        return "GET: Contato obtido com sucesso!"; 
    }

    @PostMapping("/contato")
    public String criar() {
        return "POST: Contato criado com sucesso!"; 
    }

    @PutMapping("/contato")
    public String atualizar() {
        return "PUT: Contato atualizado com sucesso!"; 
    }

    @DeleteMapping("/contato")
    public String deletar() {
        return "DELETE: Contato removido com sucesso!"; 
    }
}