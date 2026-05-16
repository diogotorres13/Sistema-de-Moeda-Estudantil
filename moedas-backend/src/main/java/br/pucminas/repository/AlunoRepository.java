package br.pucminas.repository;

import br.pucminas.model.Aluno;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import java.util.Optional;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Long> {
    Optional<Aluno> findByCpf(String cpf);
}