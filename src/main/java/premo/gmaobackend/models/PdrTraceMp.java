package premo.gmaobackend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="pdr_trace_mp")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PdrTraceMp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idpdr_trace_mp ;
    private String Id_PDR;
    private int Qte;
    private int idtr_mp;



}
