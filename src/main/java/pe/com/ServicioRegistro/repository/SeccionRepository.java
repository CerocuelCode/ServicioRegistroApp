package pe.com.ServicioRegistro.repository;

import org.springframework.data.jpa.repository.Query;
import pe.com.ServicioRegistro.entity.SeccionEntity;

import java.util.List;

public interface SeccionRepository {
    @Query("select s from SeccionEntity s where s.estado=true")
    List<SeccionEntity> findAllCustom();
    
}
