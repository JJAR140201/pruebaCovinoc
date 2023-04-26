package prueba.covinoc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prueba.covinoc.Model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
