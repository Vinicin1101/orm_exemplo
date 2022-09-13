package br.edu.ifsp.orm_exemplo.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.ifsp.orm_exemplo.model.Carro;

public interface CarroRepository extends CrudRepository<Carro, Long>{
    
}
 