package premo.gmaobackend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="trace_mp")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TraceMP {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtr;
    private int idt_mp;
    private String id_inter;
    private String id_inter_cloture;
    private String wk;
    private String Shift;
    private String Observation;
    private String Typet_mp;
    private Date dateclou;
    private Date heured;
    private Date heuref;

}
