package premo.gmaobackend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "intervenant")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Intervenant implements java.io.Serializable {
    @Id
    @GeneratedValue
    @Column(nullable = false,name="Id_Inter")

    private String Id_Inter;
    private String Nom_Inter;
    private String Prenom_Inter;
    private String email;
    @Column(name="Password")
    private String password;
    @Column(name="Login")
    private String username;
    private String Type_Inter;
    private String Picture;



}
