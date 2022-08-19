package premo.gmaobackend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name="machinee")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Machine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Machine")
    private int Id_Machine;
    private String Type_Machine;
    private String Etat_Machine;
    private String Id_Ligne;
    private String Description;
    private String No_inve;


}