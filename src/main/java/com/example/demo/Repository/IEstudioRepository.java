
package com.example.demo.Repository;

import com.example.demo.Entity.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudioRepository extends JpaRepository<Estudio,Integer>{
    
}
