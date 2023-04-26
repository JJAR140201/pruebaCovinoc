package prueba.covinoc.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table( name = "Estado")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreEstado;

    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais pais;
}
