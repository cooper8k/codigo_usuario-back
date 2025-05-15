package cl.ecomarket.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.ecomarket.user.model.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    // Este método busca por el nombre del rol y devuelve una lista de roles
    List<Rol> findByNombreRol(String nombreRol);

}
