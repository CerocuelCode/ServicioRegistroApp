package pe.com.ServicioRegistro.repository;

import org.springframework.data.jpa.repository.Query;
import pe.com.ServicioRegistro.entity.CursoEntity;

import java.util.List;

public interface CursoRepository {
    @Query("select c from CursoEntity c where c.estado=true")
    List<CursoEntity> findAllCustom();
    
}
