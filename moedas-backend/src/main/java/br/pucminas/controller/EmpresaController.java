package br.pucminas.controller;

import br.pucminas.model.EmpresaParceira;
import br.pucminas.repository.EmpresaRepository;
import io.micronaut.http.annotation.*;
import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;

@Controller("/api/empresas")
public class EmpresaController {

    @Inject
    private EmpresaRepository empresaRepository;

    @Get
    public Iterable<EmpresaParceira> listar() {
        return empresaRepository.findAll();
    }

    @Post
    public HttpResponse<EmpresaParceira> cadastrar(@Body EmpresaParceira empresa) {
        return HttpResponse.created(empresaRepository.save(empresa));
    }

    @Get("/{id}")
    public HttpResponse<EmpresaParceira> buscarPorId(@PathVariable Long id) {
        return empresaRepository.findById(id)
                .map(HttpResponse::ok)
                .orElse(HttpResponse.notFound());
    }

    @Put("/{id}")
    public HttpResponse<EmpresaParceira> atualizar(@PathVariable Long id, @Body EmpresaParceira empresaAtualizada) {
        if (!empresaRepository.existsById(id)) {
            return HttpResponse.notFound();
        }
        empresaAtualizada.setId(id);
        return HttpResponse.ok(empresaRepository.update(empresaAtualizada));
    }

    @Delete("/{id}")
    public HttpResponse<?> deletar(@PathVariable Long id) {
        if (!empresaRepository.existsById(id)) {
            return HttpResponse.notFound();
        }
        empresaRepository.deleteById(id);
        return HttpResponse.noContent();
    }
}