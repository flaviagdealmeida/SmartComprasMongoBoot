package org.smartcompras.repository;

import org.smartcompras.models.Marca;
import org.springframework.data.repository.CrudRepository;


public interface MarcaMongoRepository extends CrudRepository<Marca, String>{

}
