
package com.example.demo.Service;

import com.example.demo.Entity.Estudio;
import com.example.demo.Interface.IEstudioService;
import com.example.demo.Repository.IEstudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudioServiceImp implements IEstudioService{
      
    @Autowired IEstudioRepository iestudioRepository;
    
    @Override
    public List<Estudio> getEstudio() {
        List<Estudio> estudio = iestudioRepository.findAll();
        return estudio;
    }

    @Override
    public void saveEstudio(Estudio estudio) {
       iestudioRepository.save(estudio);
    }

    @Override
    public void deleteEstudio(int id) {
     iestudioRepository.deleteById(id);
    }

    @Override
    public Estudio findEstudio(int id) {
       Estudio estudio= iestudioRepository.findById(id).orElse(null);
       return estudio;
    }
}
