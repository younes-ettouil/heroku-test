package premo.gmaobackend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import premo.gmaobackend.modelImp.LigneInterId;

import javax.persistence.*;

@Entity
@Table(name="ligne_inter")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LigneInter  {
    @EmbeddedId
    private LigneInterId id;

    @ManyToOne(optional = false)

    @JoinColumn(name = "Id_Inter", referencedColumnName = "Id_Inter",insertable=false, updatable = false)
    public Intervenant intervenant;
    @ManyToOne
    @JoinColumn(name = "Id_Ligne", referencedColumnName = "Nom_Ligne",insertable=false, updatable = false)
    public LigneProduction ligneProduction;



}
    
