
package com.example.demo.Service;

import com.example.demo.Entity.Proyecto;
import com.example.demo.Interface.IProyectoService;
import com.example.demo.Repository.IProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoServiceImp implements IProyectoService{
    @Autowired IProyectoRepository iproyectoRepository;
    
    @Override
    public List<Proyecto> getProyecto() {
        List<Proyecto> proyecto = iproyectoRepository.findAll();
        return proyecto;
    }

    @Override
    public void saveProyecto(Proyecto proyecto) {
       iproyectoRepository.save(proyecto);
    }

    @Override
    public void deleteProyecto(int id) {
     iproyectoRepository.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(int id) {
       Proyecto proyecto= iproyectoRepository.findById(id).orElse(null);
       return proyecto;
    }
}
