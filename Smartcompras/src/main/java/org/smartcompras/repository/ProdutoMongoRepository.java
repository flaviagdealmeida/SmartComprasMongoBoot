package org.smartcompras.repository;


import org.smartcompras.models.Produto;
import org.springframework.data.repository.CrudRepository;


public interface ProdutoMongoRepository extends CrudRepository<Produto, String>{

}
