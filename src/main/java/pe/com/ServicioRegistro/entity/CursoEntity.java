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
@Entity(name = "CursoEntity")
// Nombre de la tabla en la BD
@Table(name = "tbl_curso")
public class CursoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    // Llave Primaria (PK)
    @Id
    @Column(name = "codcurso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(name = "nomcurso")
    private String nombre;

    @ManyToOne
    @JoinColumn(name="codprofesor", nullable = false)
    private ProfesorEntity profesor;

    @Column(name = "estcurso")
    private boolean estado;
}
