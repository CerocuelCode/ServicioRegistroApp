package pe.com.ServicioRegistro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.ServicioRegistro.entity.GradoEntity;

import java.util.List;

public interface GradoRepository extends JpaRepository<GradoEntity, Long> {
    @Query("select g from GradoEntity g where g.estado=true")
    List<GradoEntity> findAllCustom();
    
}
