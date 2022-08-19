package premo.gmaobackend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
@Table(name="pdr")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pdr {
    @Id
    @Column(name = "Id")
    private int Id;

    private String Id_PDR;
    private String Nom_PDR;
    private  String Type_Machine;


}
