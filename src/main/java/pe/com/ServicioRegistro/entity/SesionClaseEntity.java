package pe.com.ServicioRegistro.entity;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

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
@Entity(name = "SesionClaseEntity")
// Nombre de la tabla en la BD
@Table(name = "tbl_sesionclase")
public class SesionClaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    // Llave Primaria (PK)
    @Id
    @Column(name = "codsesion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @ManyToOne
    @JoinColumn(name="codcurso", nullable = false)
    private CursoEntity curso;

    @Column(name = "fechasesion")
    private LocalDate fecha;

    @Column(name = "horainiciosesion")
    private LocalTime horaInicio;

    @Column(name = "horafinsesion")
    private LocalTime horaFin;

    @Column(name = "estsesion")
    private boolean estado;
}
