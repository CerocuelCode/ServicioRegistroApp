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
    @Column(name = "codprofesor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(name = "nomprofesor")
    private String nombre;

    @Column(name = "apepprofesor")
    private String apellidoPaterno;

    @Column(name = "apemprofesor")
    private String apellidoMaterno;

    @Column(name = "dirprofesor")
    private String direccion;

    @Column(name = "correoprofesor")
    private String correo;

    @Column(name = "estprofesor")
    private boolean estado;
}
