package pe.com.ServicioRegistro.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ServicioRegistro.entity.AsistenciaEntity;
import pe.com.ServicioRegistro.service.AsistenciaService;

import java.util.List;

@RestController
@RequestMapping("/asistencia")
public class AsistenciaRestController {
    @Autowired
    private AsistenciaService service;

    //Listados --> GET
    @GetMapping
    public List<AsistenciaEntity> findAll(){
        return service.findAll();
    }

    @GetMapping("/custom")
    public List<AsistenciaEntity> findAllCustom(){
        return service.findAllCustom();
    }

    @GetMapping("/{id}")
    public AsistenciaEntity findById(@PathVariable long id){
        return service.findById(id);
    }

    //Registrar -->POST
    @PostMapping
    public AsistenciaEntity add(@RequestBody AsistenciaEntity a){
        return service.add(a);
    }

    //Actualizar -->PUT
    @PutMapping("/{id}")
    public AsistenciaEntity update(@PathVariable long id, @RequestBody AsistenciaEntity a){
        a.setCodigo(id);
        return service.update(a);
    }

    //Eliminar --> DELETE
    @DeleteMapping("/{id}")
    public AsistenciaEntity delete(@PathVariable long id){
        return service.delete(AsistenciaEntity.builder().codigo(id).build());
    }
}
