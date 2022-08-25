
package com.example.demo.Service;

import com.example.demo.Entity.Persona;
import com.example.demo.Interface.IPersonaService;
import com.example.demo.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
       ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(int id) {
     ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(int id) {
       Persona persona= ipersonaRepository.findById(id).orElse(null);
       return persona;
    }
}
