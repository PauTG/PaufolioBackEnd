
package com.example.demo.Interface;

import com.example.demo.Entity.Proyecto;
import java.util.List;


public interface IProyectoService {
    public List<Proyecto> getProyecto();
    
    public void saveProyecto(Proyecto proyecto);
    
    public void deleteProyecto (int id);
    
    public Proyecto findProyecto(int id);
}
