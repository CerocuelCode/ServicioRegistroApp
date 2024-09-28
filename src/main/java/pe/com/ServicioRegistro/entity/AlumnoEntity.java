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
@Entity(name = "AlumnoEntity")
// Nombre de la tabla en la BD
@Table(name = "tbl_alumno")
public class AlumnoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    // Llave Primaria (PK)
    @Id
    @Column(name = "codAlumno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(name = "nomAlumno")
    private String nombre;

    @Column(name = "apepAlumno")
    private String apellidoPaterno;

    @Column(name = "apemAlumno")
    private String apellidoMaterno;

    @Column(name = "apemAlumno")
    private String direccion;

    @Column(name = "correoAlumno")
    private String correo;

    @ManyToOne
    @JoinColumn(name="codGrado", nullable = false)
    private GradoEntity grado;

    @ManyToOne
    @JoinColumn(name="codSeccion", nullable = false)
    private SeccionEntity seccion;

    @ManyToOne
    @JoinColumn(name="codTurno", nullable = false)
    private TurnoEntity turno;

    @Column(name = "estAlumno")
    private boolean estado;
}
