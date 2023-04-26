package prueba.covinoc.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table( name = "Pais")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombrePais;
}
