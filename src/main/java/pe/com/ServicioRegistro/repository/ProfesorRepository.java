package pe.com.ServicioRegistro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.ServicioRegistro.entity.ProfesorEntity;

import java.util.List;

public interface ProfesorRepository extends JpaRepository<ProfesorEntity, Long> {
    @Query("select p from ProfesorEntity p where p.estado=true")
    List<ProfesorEntity> findAllCustom();
    
}
