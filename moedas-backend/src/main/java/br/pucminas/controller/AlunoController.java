package br.pucminas.controller;

import br.pucminas.model.Aluno;
import br.pucminas.repository.AlunoRepository;
import io.micronaut.http.annotation.*;
import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;

@Controller("/api/alunos")
public class AlunoController {

    @Inject
    private AlunoRepository alunoRepository;

    @Get
    public Iterable<Aluno> listar() {
        return alunoRepository.findAll();
    }

    @Post
    public HttpResponse<Aluno> cadastrar(@Body Aluno aluno) {
        return HttpResponse.created(alunoRepository.save(aluno));
    }

    @Get("/{id}")
    public HttpResponse<Aluno> buscarPorId(@PathVariable Long id) {
        return alunoRepository.findById(id)
                .map(HttpResponse::ok)
                .orElse(HttpResponse.notFound());
    }

    @Put("/{id}")
    public HttpResponse<Aluno> atualizar(@PathVariable Long id, @Body Aluno alunoAtualizado) {
        if (!alunoRepository.existsById(id)) {
            return HttpResponse.notFound();
        }
        alunoAtualizado.setId(id);
        return HttpResponse.ok(alunoRepository.update(alunoAtualizado));
    }

    @Delete("/{id}")
    public HttpResponse<?> deletar(@PathVariable Long id) {
        if (!alunoRepository.existsById(id)) {
            return HttpResponse.notFound();
        }
        alunoRepository.deleteById(id);
        return HttpResponse.noContent();
    }
}