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
@Entity(name = "ProfesorEntity")
// Nombre de la tabla en la BD
@Table(name = "tbl_profesor")
public class ProfesorEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    // Llave Primaria (PK)
    @Id
    @Column(name = "codProfesor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(name = "nomProfesor")
    private String nombre;

    @Column(name = "apepProfesor")
    private String apellidoPaterno;

    @Column(name = "apemProfesor")
    private String apellidoMaterno;

    @Column(name = "dirProfesor")
    private String direccion;

    @Column(name = "correoProfesor")
    private String correo;

    @Column(name = "estProfesor")
    private boolean estado;
}
