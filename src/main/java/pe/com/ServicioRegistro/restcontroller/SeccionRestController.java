package pe.com.ServicioRegistro.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ServicioRegistro.entity.SeccionEntity;
import pe.com.ServicioRegistro.service.SeccionService;

import java.util.List;

@RestController
@RequestMapping("/seccion")
public class SeccionRestController {
    @Autowired
    private SeccionService service;

    //Listados --> GET
    @GetMapping
    public List<SeccionEntity> findAll(){
        return service.findAll();
    }

    @GetMapping("/custom")
    public List<SeccionEntity> findAllCustom(){
        return service.findAllCustom();
    }

    @GetMapping("/{id}")
    public SeccionEntity findById(@PathVariable long id){
        return service.findById(id);
    }

    //Registrar -->POST
    @PostMapping
    public SeccionEntity add(@RequestBody SeccionEntity s){
        return service.add(s);
    }

    //Actualizar -->PUT
    @PutMapping("/{id}")
    public SeccionEntity update(@PathVariable long id, @RequestBody SeccionEntity s){
        s.setCodigo(id);
        return service.update(s);
    }

    //Eliminar --> DELETE
    @DeleteMapping("/{id}")
    public SeccionEntity delete(@PathVariable long id){
        SeccionEntity objSeccion = new SeccionEntity();
        objSeccion.setEstado(false);
        return service.delete(SeccionEntity.builder().codigo(id).build());
    }
}
