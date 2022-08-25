
package com.example.demo.Repository;

import com.example.demo.Entity.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContactoRepository extends JpaRepository<Contacto,Integer> {
    
}
