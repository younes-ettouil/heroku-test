package premo.gmaobackend.modelImp;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class LigneInterId  implements Serializable {
    @Column(name="Id_Inter")
    private String Id_Inter;
    @Column(name="Id_Ligne")
    private String Nom_ligne;

}
