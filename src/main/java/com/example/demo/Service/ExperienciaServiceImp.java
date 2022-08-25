
package com.example.demo.Service;

import com.example.demo.Entity.Experiencia;
import com.example.demo.Interface.IExperienciaService;
import com.example.demo.Repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaServiceImp implements IExperienciaService {
       @Autowired IExperienciaRepository iexperienciaRepository;
    
    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> experiencia = iexperienciaRepository.findAll();
        return experiencia;
    }

    @Override
    public void saveExperiencia(Experiencia experiencia) {
       iexperienciaRepository.save(experiencia);
    }

    @Override
    public void deleteExperiencia(int id) {
     iexperienciaRepository.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(int id) {
       Experiencia experiencia= iexperienciaRepository.findById(id).orElse(null);
       return experiencia;
    }
}
