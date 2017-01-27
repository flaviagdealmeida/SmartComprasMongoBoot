package br.org.smartcompras.repository;

import br.org.smartcompras.models.Usuario;
import org.springframework.data.repository.CrudRepository;


public interface UsuarioMongoRepository extends CrudRepository<Usuario, String>{

}
