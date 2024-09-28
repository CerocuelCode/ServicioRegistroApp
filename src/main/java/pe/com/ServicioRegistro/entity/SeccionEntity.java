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
@Entity(name = "SeccionEntity")
// Nombre de la tabla en la BD
@Table(name = "tbl_seccion")
public class SeccionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    // Llave Primaria (PK)
    @Id
    @Column(name = "codSeccion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(name = "nomSeccion")
    private String nombre;

    @Column(name = "estSeccion")
    private boolean estado;
}
