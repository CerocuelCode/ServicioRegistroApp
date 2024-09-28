package pe.com.ServicioRegistro.repository;

import org.springframework.data.jpa.repository.Query;
import pe.com.ServicioRegistro.entity.TurnoEntity;

import java.util.List;

public interface TurnoRepository {
    @Query("select t from TurnoEntity t where t.estado=true")
    List<TurnoEntity> findAllCustom();
    
}
