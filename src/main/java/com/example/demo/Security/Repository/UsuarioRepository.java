
package com.example.demo.Security.Repository;

import com.example.demo.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
        Optional<Usuario> findByNombreUsuario(String nombreUsuario);
        boolean existsByNombreUsuario(String nombreUsuario);
        boolean existsByEmail(String email);
}
