
package com.example.demo.Interface;

import com.example.demo.Entity.Estudio;
import java.util.List;


public interface IEstudioService {
   
    public List<Estudio> getEstudio();
    
    public void saveEstudio (Estudio estudio);
    
    public void deleteEstudio (int id);
    
    public Estudio findEstudio(int id);  
}
