package prueba.covinoc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prueba.covinoc.Model.Pais;

public interface PaisRepository extends JpaRepository<Pais, Long> {
}
