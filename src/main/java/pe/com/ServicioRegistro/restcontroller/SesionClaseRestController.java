package pe.com.ServicioRegistro.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ServicioRegistro.entity.SesionClaseEntity;
import pe.com.ServicioRegistro.service.SesionClaseService;

import java.util.List;

@RestController
@RequestMapping("/sesionclase")
public class SesionClaseRestController {
    @Autowired
    private SesionClaseService service;

    //Listados --> GET
    @GetMapping
    public List<SesionClaseEntity> findAll(){
        return service.findAll();
    }

    @GetMapping("/custom")
    public List<SesionClaseEntity> findAllCustom(){
        return service.findAllCustom();
    }

    @GetMapping("/{id}")
    public SesionClaseEntity findById(@PathVariable long id){
        return service.findById(id);
    }

    //Registrar -->POST
    @PostMapping
    public SesionClaseEntity add(@RequestBody SesionClaseEntity sc){
        return service.add(sc);
    }

    //Actualizar -->PUT
    @PutMapping("/{id}")
    public SesionClaseEntity update(@PathVariable long id, @RequestBody SesionClaseEntity sc){
        sc.setCodigo(id);
        return service.update(sc);
    }

    //Eliminar --> DELETE
    @DeleteMapping("/{id}")
    public SesionClaseEntity delete(@PathVariable long id){
        SesionClaseEntity objSesionClase = new SesionClaseEntity();
        objSesionClase.setEstado(false);
        return service.delete(SesionClaseEntity.builder().codigo(id).build());
    }
}
