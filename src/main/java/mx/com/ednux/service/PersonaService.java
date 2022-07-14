package mx.com.ednux.service;

import mx.com.ednux.model.Persona;

import java.util.List;

public interface PersonaService {

    public List<Persona> getPersons();

    public void addPerson(Persona persona);

    public void deletedPerson(Persona persona);

    public  Persona getPerson(Persona persona);

}
