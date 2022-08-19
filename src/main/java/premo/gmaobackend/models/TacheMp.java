package premo.gmaobackend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name = "tache_mp")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TacheMp {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int IdT;
  private String TypeT;
  private String Type;
  private String Id_Ligne;
  private String Id_Machine;
  private String Id_Fr;
  private int IdE;

}