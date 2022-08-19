package premo.gmaobackend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "commandespeciale")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommandeSpeciale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idcomsp;
    private String codeart;
    private String description;
    private String datecommande;
    private String photo;
    private String commanderpar;
    private String motif;
    private String receptionner;
    private String datelivraison;
    private String id_ligne;


}
