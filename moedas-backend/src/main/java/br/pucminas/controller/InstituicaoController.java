package br.pucminas.controller;

import io.micronaut.http.annotation.*;
import io.micronaut.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

@Controller("/api/instituicoes")
public class InstituicaoController {

    @Get
    public HttpResponse<List<Map<String, Object>>> listar() {
        // Retorna as instituições pré-cadastradas exigidas no escopo do projeto
        return HttpResponse.ok(Arrays.asList(
            Map.of("id", 1L, "nome", "PUC Minas - Coração Eucarístico"),
            Map.of("id", 2L, "nome", "PUC Minas - Praça da Liberdade"),
            Map.of("id", 3L, "nome", "PUC Minas - São Gabriel")
        ));
    }
}