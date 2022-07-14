package mx.com.ednux.service;

import mx.com.ednux.dao.PersonaDao;
import mx.com.ednux.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    private PersonaDao personaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Persona> getPersons() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional
    public void addPerson(Persona persona) {
        personaDao.save(persona);
    }

    @Override
    @Transactional
    public void deletedPerson(Persona persona) {
        personaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona getPerson(Persona persona) {
        return personaDao.findById(persona.getId()).orElse(null);
    }
}
