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
    @Column(name = "codalumno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(name = "nomalumno")
    private String nombre;

    @Column(name = "apepalumno")
    private String apellidoPaterno;

    @Column(name = "apemalumno")
    private String apellidoMaterno;

    @Column(name = "diralumno")
    private String direccion;

    @Column(name = "correoalumno")
    private String correo;

    @ManyToOne
    @JoinColumn(name="codgrado", nullable = false)
    private GradoEntity grado;

    @ManyToOne
    @JoinColumn(name="codseccion", nullable = false)
    private SeccionEntity seccion;

    @ManyToOne
    @JoinColumn(name="codturno", nullable = false)
    private TurnoEntity turno;

    @Column(name = "estalumno")
    private boolean estado;
}
