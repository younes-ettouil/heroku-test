package premo.gmaobackend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "intervantion_sans_panne")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InterventionSP {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_in_s_p;
    private Date DateD;
    private Date DateF;
    private String Description;
    private String Id_Inter;
    private String Id_Ligne;
    private String Id_Machine;


}
