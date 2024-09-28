package pe.com.ServicioRegistro.repository;

import org.springframework.data.jpa.repository.Query;
import pe.com.ServicioRegistro.entity.AlumnoEntity;

import java.util.List;

public interface AlumnoRepository {
    @Query("select a from AlumnoEntity a where a.estado=true")
    List<AlumnoEntity> findAllCustom();
}
