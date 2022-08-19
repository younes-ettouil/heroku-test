package premo.gmaobackend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "motif")
public class Motif {
    @Id
    private int idmotif;
    private String Motif;
    private String Date_Motif;
    private String commanderpar;
    private String commandepDR;
    private int Qte;
    private String Remarque;
    private int Id_trace;
    private String Supprimer;
}
