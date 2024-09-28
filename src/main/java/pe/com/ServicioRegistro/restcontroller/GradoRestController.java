package pe.com.ServicioRegistro.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ServicioRegistro.entity.GradoEntity;
import pe.com.ServicioRegistro.service.GradoService;

import java.util.List;

@RestController
@RequestMapping("/grado")
public class GradoRestController {
    @Autowired
    private GradoService service;

    //Listados --> GET
    @GetMapping
    public List<GradoEntity> findAll(){
        return service.findAll();
    }

    @GetMapping("/custom")
    public List<GradoEntity> findAllCustom(){
        return service.findAllCustom();
    }

    @GetMapping("/{id}")
    public GradoEntity findById(@PathVariable long id){
        return service.findById(id);
    }

    //Registrar -->POST
    @PostMapping
    public GradoEntity add(@RequestBody GradoEntity g){
        return service.add(g);
    }

    //Actualizar -->PUT
    @PutMapping("/{id}")
    public GradoEntity update(@PathVariable long id, @RequestBody GradoEntity g){
        g.setCodigo(id);
        return service.update(g);
    }

    //Eliminar --> DELETE
    @DeleteMapping("/{id}")
    public GradoEntity delete(@PathVariable long id){
        GradoEntity objGrado = new GradoEntity();
        objGrado.setEstado(false);
        return service.delete(GradoEntity.builder().codigo(id).build());
    }
}
