package premo.gmaobackend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="ligneproduction")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LigneProduction implements java.io.Serializable {
    @Id
    @Column(nullable = false,name = "Id_Ligne")
    private String Id_Ligne;
    private int nbr_Mach_Ligne;

    private String Nom_ligne;


}
