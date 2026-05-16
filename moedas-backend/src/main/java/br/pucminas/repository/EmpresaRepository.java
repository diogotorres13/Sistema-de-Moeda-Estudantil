package br.pucminas.repository;

import br.pucminas.model.EmpresaParceira;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import java.util.Optional;

@Repository
public interface EmpresaRepository extends CrudRepository<EmpresaParceira, Long> {
    Optional<EmpresaParceira> findByCnpj(String cnpj);
}