package pe.com.ServicioRegistro.entity;

import java.sql.Time;
import java.util.Date;

public class SesionClaseEntity {
    private long codigo;
    private CursoEntity curso;
    private Date fecha;
    private Time horaInicio;
    private Time horaFin;
    private boolean estado;
}
