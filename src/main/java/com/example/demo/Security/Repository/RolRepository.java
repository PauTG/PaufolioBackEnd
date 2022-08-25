
package com.example.demo.Security.Repository;

import com.example.demo.Security.Entity.Rol;
import com.example.demo.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface RolRepository extends JpaRepository <Rol, Integer> {
     Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
