package prueba.covinoc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prueba.covinoc.Model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
}
