error id: file:///C:/Users/vitorsantana/Desktop/faculdade/backend-mafra/atividade-3/api-contato/src/main/java/com/uninassau/api_contato/ApiContatoApplication.java:org/springframework/web/bind/annotation/GetMapping#
file:///C:/Users/vitorsantana/Desktop/faculdade/backend-mafra/atividade-3/api-contato/src/main/java/com/uninassau/api_contato/ApiContatoApplication.java
empty definition using pc, found symbol in pc: org/springframework/web/bind/annotation/GetMapping#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 115
uri: file:///C:/Users/vitorsantana/Desktop/faculdade/backend-mafra/atividade-3/api-contato/src/main/java/com/uninassau/api_contato/ApiContatoApplication.java
text:
```scala

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMa@@pping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiContatoApplication {

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
```


#### Short summary: 

empty definition using pc, found symbol in pc: org/springframework/web/bind/annotation/GetMapping#