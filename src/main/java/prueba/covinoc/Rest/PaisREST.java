package prueba.covinoc.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prueba.covinoc.Model.Pais;
import prueba.covinoc.Service.PaisService;

import java.util.List;

@RestController
@RequestMapping("/pais/")
public class PaisREST {
    @Autowired
    private PaisService paisService;

    @GetMapping
    private ResponseEntity<List<Pais>> getAllPaises () {
        return ResponseEntity.ok(paisService.findAll());
    }
}
