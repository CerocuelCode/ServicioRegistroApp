package pe.com.ServicioRegistro.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

// Genera la clase Builder
@Builder
// Metodo constructor sin parametros
@NoArgsConstructor
// Metodo contructor con parametros
@AllArgsConstructor
// Metodos GETTER y SETTER
@Data
// Nombre de la entidad
@Entity(name = "AsistenciaEntity")
// Nombre de la tabla en la BD
@Table(name = "tbl_asistencia")
public class AsistenciaEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    // Llave Primaria (PK)
    @Id
    @Column(name = "codasistencia")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @ManyToOne
    @JoinColumn(name="codalumno", nullable = false)
    private AlumnoEntity alumno;

    @ManyToOne
    @JoinColumn(name="codsesion", nullable = false)
    private SesionClaseEntity sesion;

    @Column(name = "presenteasistencia")
    private boolean presente;
}
