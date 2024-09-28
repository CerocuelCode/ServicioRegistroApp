package pe.com.ServicioRegistro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.ServicioRegistro.entity.SesionClaseEntity;

import java.util.List;

public interface SesionClaseRepository extends JpaRepository<SesionClaseEntity, Long> {
    @Query("select sc from SesionClaseEntity sc where sc.estado=true")
    List<SesionClaseEntity> findAllCustom();
    
}
