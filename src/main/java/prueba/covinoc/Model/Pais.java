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
    private int id;
    private String nombrePais;
}
