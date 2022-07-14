package mx.com.ednux.dao;

import mx.com.ednux.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long> {

}
