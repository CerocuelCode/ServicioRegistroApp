package pe.com.ServicioRegistro.repository;

import org.springframework.data.jpa.repository.Query;
import pe.com.ServicioRegistro.entity.AsistenciaEntity;

import java.util.List;

public interface AsistenciaRepository {
    // Consulta para obtener todas las asistencias donde el alumno estuvo presente
    @Query("select aa from AsistenciaEntity aa where aa.presente = true")
    List<AsistenciaEntity> findAllCustom();
}
