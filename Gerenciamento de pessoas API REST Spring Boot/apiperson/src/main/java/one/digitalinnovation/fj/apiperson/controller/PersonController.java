package one.digitalinnovation.fj.apiperson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// controlador que sera acessao a partir de uma API REST
@RestController

// caminho principal da API
// atender nivel 1 de maturidade REST
// recursos bem definidos
// java permite definir a nivl de classe o recurso
// sempre versionar a api
@RequestMapping("/api/v1/people")

public class PersonController {

    // mapeando uma  operação http do tipo GET
    // tudo que acessamos no browse o fazemos a partor do metodo GET

    @GetMapping
    public String getBook() {
        return "API Test!";
    }
}
