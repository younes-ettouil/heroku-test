package premo.gmaobackend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pdr_trace")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PdrTrace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_P_T;
    private String Id_PDR;
    private int Qte;
    private int Id_Trace;


}
