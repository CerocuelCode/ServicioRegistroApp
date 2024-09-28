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
@Entity(name = "GradoEntity")
// Nombre de la tabla en la BD
@Table(name = "tbl_grado")
public class GradoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    // Llave Primaria (PK)
    @Id
    @Column(name = "codGrado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(name = "nomGrado")
    private String nombre;

    @Column(name = "estGrado")
    private boolean estado;
}
