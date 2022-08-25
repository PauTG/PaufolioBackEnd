
package com.example.demo.Repository;

import com.example.demo.Entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectoRepository extends JpaRepository <Proyecto,Integer>{
    
}
