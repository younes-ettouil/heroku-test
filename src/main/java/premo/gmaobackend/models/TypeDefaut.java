package premo.gmaobackend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name="type_default")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
    public class TypeDefaut {
        @Id
        @GeneratedValue
        @Column(name = "idty")
        private int idTy;
        @Column(name = "codety")
        private String CodeTy;
        @Column(name = "descriptionty")
        private String DescriptionTy;
        @Column(name = "typemachaine")
        private String Typemachaine;


}
